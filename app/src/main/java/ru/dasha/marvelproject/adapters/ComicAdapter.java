package ru.dasha.marvelproject.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

import ru.dasha.marvelproject.R;
import ru.dasha.marvelproject.model.Result;

/***
 * This class is adapter to show data on layout.
 */
public class ComicAdapter extends ArrayAdapter<Result> {

    List<Result> resultList;
    Context context;
    private LayoutInflater mInflater;

    public ComicAdapter(Context context, List<Result> objects) {
        super(context, 0, objects);
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
        resultList = objects;
    }

    @Override
    public Result getItem(int position) {
        return resultList.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder vh;
        if (convertView == null) {
            View view = mInflater.inflate(R.layout.layout_row_view, parent, false);
            vh = ViewHolder.create((RelativeLayout) view);
            view.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }

        Result item = getItem(position);

        vh.textViewTitle.setText(item.getTitle());
        vh.textViewDescription.setText(item.getDescription());
        return vh.rootView;
    }

    private static class ViewHolder {
        public final RelativeLayout rootView;
        public final TextView textViewTitle;
        public final TextView textViewDescription;

        private ViewHolder(RelativeLayout rootView, TextView textViewTitle, TextView textViewDescription) {
            this.rootView = rootView;
            this.textViewTitle = textViewTitle;
            this.textViewDescription = textViewDescription;
        }

        public static ViewHolder create(RelativeLayout rootView) {
            TextView textViewTitle = (TextView) rootView.findViewById(R.id.textViewTitle);
            TextView textViewDescription = (TextView) rootView.findViewById(R.id.textViewDescription);
            return new ViewHolder(rootView, textViewTitle, textViewDescription);
        }

    }

}
