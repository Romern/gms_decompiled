package p000;

import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import com.google.android.chimera.CursorLoader;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: anph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anph implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ anpm f77393a;

    public anph(anpm anpm) {
        this.f77393a = anpm;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new CursorLoader(this.f77393a.getActivity(), ContactsContract.CommonDataKinds.Email.CONTENT_URI, anot.f77329b, "account_name = ?", new String[]{this.f77393a.f77411j}, "starred DESC,times_contacted DESC,last_time_contacted DESC");
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor != null) {
            anpb anpb = (anpb) this.f77393a.getListAdapter();
            int i = this.f77393a.f77406i;
            anpb.f77372q = cursor;
            anpb.f77374s = i;
            anpb.f77381z = anpb.mo42057a(anpb.f77373r, anpb.f77372q);
            anpb.mo42068g();
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
