package p000;

import android.database.Cursor;
import android.support.p002v7.widget.SearchView;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: adb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adb implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f249a;

    public adb(SearchView searchView) {
        this.f249a = searchView;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        SearchView searchView = this.f249a;
        Editable text = searchView.f1251a.getText();
        Cursor cursor = searchView.f1264q.f624d;
        if (cursor == null) {
            return;
        }
        if (cursor.moveToPosition(i)) {
            CharSequence b = searchView.f1264q.mo433b(cursor);
            if (b != null) {
                searchView.mo1621b(b);
            } else {
                searchView.mo1621b(text);
            }
        } else {
            searchView.mo1621b(text);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
