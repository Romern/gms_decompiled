package com.google.android.chimera;

import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ListFragment extends Fragment {

    /* renamed from: a */
    private C1084io f7639a = null;

    /* renamed from: bG */
    private final den m4857bG() {
        return (den) getProxy();
    }

    public Object getContainerFragment() {
        return getProxy();
    }

    public ListAdapter getListAdapter() {
        return m4857bG().superGetListAdapter();
    }

    public ListView getListView() {
        return m4857bG().superGetListView();
    }

    public long getSelectedItemId() {
        return m4857bG().superGetSelectedItemId();
    }

    public int getSelectedItemPosition() {
        return m4857bG().superGetSelectedItemPosition();
    }

    public void onListItemClick(ListView listView, View view, int i, long j) {
        m4857bG().superOnListItemClick(listView, view, i, j);
    }

    public void setEmptyText(CharSequence charSequence) {
        m4857bG().superSetEmptyText(charSequence);
    }

    /* access modifiers changed from: protected */
    public final void setImpl(C1084io ioVar) {
        super.setImpl((C1018gh) ioVar);
        this.f7639a = ioVar;
    }

    public void setListAdapter(ListAdapter listAdapter) {
        m4857bG().superSetListAdapter(listAdapter);
    }

    public void setListShown(boolean z) {
        m4857bG().superSetListShown(z);
    }

    public void setListShownNoAnimation(boolean z) {
        m4857bG().superSetListShownNoAnimation(z);
    }

    public void setSelection(int i) {
        m4857bG().superSetSelection(i);
    }

    public void setTargetFragment(ListFragment listFragment, int i) {
        getProxy().setTargetFragment((ListFragmentProxy) listFragment.getContainerFragment(), i);
    }

    /* access modifiers changed from: protected */
    public C1084io getProxy() {
        if (this.f7639a == null) {
            setImpl((C1084io) new ListFragmentProxy(this));
        }
        return this.f7639a;
    }

    public C1084io getSupportContainerFragment() {
        return getProxy();
    }
}
