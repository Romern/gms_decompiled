package p000;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.CursorLoader;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: anoi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anoi implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ anon f77292a;

    public anoi(anon anon) {
        this.f77292a = anon;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        CursorLoader cursorLoader = new CursorLoader(this.f77292a.getActivity());
        cursorLoader.setUri(ContactsContract.CommonDataKinds.Email.CONTENT_URI);
        cursorLoader.setProjection(anot.f77329b);
        cursorLoader.setSelection(anon.f77297a);
        String concat = String.valueOf(this.f77292a.f77299c).concat("%");
        String str = this.f77292a.f77299c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3);
        sb.append("% ");
        sb.append(str);
        sb.append("%");
        cursorLoader.setSelectionArgs(new String[]{this.f77292a.f77411j, concat, concat, sb.toString()});
        return cursorLoader;
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor != null) {
            anog anog = (anog) this.f77292a.getListAdapter();
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            cursor.moveToPosition(-1);
            while (cursor.moveToNext()) {
                String string = cursor.getString(3);
                if (!TextUtils.isEmpty(string) && !hashSet.contains(string)) {
                    hashSet.add(string);
                    String string2 = cursor.getString(2);
                    Uri lookupUri = ContactsContract.Contacts.getLookupUri(cursor.getLong(0), cursor.getString(1));
                    AudienceMember a = AudienceMember.m22638a(string, string2);
                    if (!string.equals(string2)) {
                        a.f30298h.putString("secondaryText", string);
                    }
                    a.f30298h.putString("contactsAvatarUri", lookupUri.toString());
                    a.f30298h.putInt("contactType", 1);
                    arrayList.add(a);
                }
            }
            anog.f77290d = arrayList.size() > 0 ? new aonp(anog, (int) C0126R.string.plus_audience_selection_search_device_results, new anor(anog, arrayList, 0, arrayList.size(), 3)) : null;
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
