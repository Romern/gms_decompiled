package p000;

import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.chimera.Fragment;

/* renamed from: den */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface den extends Fragment.ProxyCallbacks {
    ListAdapter superGetListAdapter();

    ListView superGetListView();

    long superGetSelectedItemId();

    int superGetSelectedItemPosition();

    void superOnListItemClick(ListView listView, View view, int i, long j);

    void superSetEmptyText(CharSequence charSequence);

    void superSetListAdapter(ListAdapter listAdapter);

    void superSetListShown(boolean z);

    void superSetListShownNoAnimation(boolean z);

    void superSetSelection(int i);
}
