package p000;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Pair;
import com.google.android.chimera.CursorLoader;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.p042v2.model.ContactPerson;
import com.google.android.gms.people.model.AvatarReference;
import java.util.ArrayList;
import java.util.TreeMap;

/* renamed from: wng */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wng implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ wnj f50951a;

    public wng(wnj wnj) {
        this.f50951a = wnj;
    }

    /* renamed from: a */
    private final boolean m42059a(int i) {
        int[] iArr = this.f50951a.f50960g.f31450k;
        if (iArr == null || iArr.length == 0) {
            return true;
        }
        return sqc.m35957a(iArr, i);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        AvatarReference avatarReference;
        Cursor cursor = (Cursor) obj;
        wnj wnj = this.f50951a;
        if (!wnj.f50962i) {
            wnj.f50961h = 0;
            wnj.f50955b = new TreeMap(wnf.f50950a);
            if (cursor.getCount() > 0) {
                cursor.moveToFirst();
                do {
                    String string = cursor.getString(cursor.getColumnIndex("display_name"));
                    String string2 = cursor.getString(cursor.getColumnIndex("_id"));
                    int i = cursor.getInt(cursor.getColumnIndex("has_phone_number"));
                    String string3 = cursor.getString(cursor.getColumnIndex("photo_thumb_uri"));
                    Long valueOf = Long.valueOf(Long.parseLong(string2));
                    Uri uri = null;
                    if (string3 != null) {
                        avatarReference = new AvatarReference(3, string3);
                    } else {
                        avatarReference = null;
                    }
                    if (string3 != null) {
                        uri = Uri.parse(string3);
                    }
                    ContactPerson contactPerson = new ContactPerson(string, valueOf, avatarReference, uri);
                    if (m42059a(0)) {
                        ArrayList arrayList = new ArrayList();
                        Cursor query = this.f50951a.getContext().getContentResolver().query(ContactsContract.CommonDataKinds.Email.CONTENT_URI, null, "contact_id = ?", new String[]{string2}, null);
                        if (query != null) {
                            while (query.moveToNext()) {
                                String string4 = query.getString(query.getColumnIndex("data1"));
                                if (string4 != null) {
                                    ContactPerson.ContactMethod contactMethod = new ContactPerson.ContactMethod(0, string4);
                                    if (!arrayList.contains(contactMethod)) {
                                        arrayList.add(contactMethod);
                                    }
                                }
                            }
                            query.close();
                        }
                        contactPerson.mo18541a(arrayList);
                    }
                    if (i > 0 && m42059a(1)) {
                        ArrayList arrayList2 = new ArrayList();
                        Cursor query2 = this.f50951a.getContext().getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id = ?", new String[]{string2}, null);
                        if (query2 != null) {
                            while (query2.moveToNext()) {
                                String string5 = query2.getString(query2.getColumnIndex("data1"));
                                if (string5 != null) {
                                    ContactPerson.ContactMethod contactMethod2 = new ContactPerson.ContactMethod(1, string5);
                                    if (!arrayList2.contains(contactMethod2)) {
                                        arrayList2.add(contactMethod2);
                                    }
                                }
                            }
                            query2.close();
                        }
                        contactPerson.mo18541a(arrayList2);
                    }
                    if (!contactPerson.f31436d.isEmpty()) {
                        this.f50951a.f50955b.put(contactPerson, new wni());
                    }
                } while (cursor.moveToNext());
            }
            wnj wnj2 = this.f50951a;
            wnj2.f50964k = new wnc(new ArrayList(wnj2.f50955b.keySet()), wnj2.getContext(), wnj2);
            wnj2.f50959f.setAdapter(wnj2.f50964k);
            wnj2.f50958e.setAdapter(new wmx(new ArrayList(wnj2.f50955b.keySet()), wnj2));
            wnj2.f50962i = true;
            if (!this.f50951a.f50957d.isEmpty()) {
                wnj wnj3 = this.f50951a;
                wnj3.f50961h = wnj3.f50957d.size();
                this.f50951a.mo29223b();
                ArrayList arrayList3 = this.f50951a.f50957d;
                int size = arrayList3.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Pair pair = (Pair) arrayList3.get(i2);
                    ContactPerson contactPerson2 = (ContactPerson) pair.first;
                    ContactPerson.ContactMethod contactMethod3 = (ContactPerson.ContactMethod) pair.second;
                    if (wnj.m42064d(contactPerson2)) {
                        this.f50951a.f50956c.add(contactMethod3);
                    } else {
                        ((wni) this.f50951a.f50955b.get(contactPerson2)).f50952a.add(contactMethod3);
                        wnj wnj4 = this.f50951a;
                        wnj4.f50964k.mo158M(wnj4.mo29220a(contactPerson2));
                    }
                    this.f50951a.mo29222a(contactPerson2, contactMethod3);
                }
                this.f50951a.mo29221a();
            }
        }
    }

    public final void onLoaderReset(Loader loader) {
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Uri uri = ContactsContract.Contacts.CONTENT_URI;
        String[] strArr = {"_id", "display_name", "has_phone_number", "photo_thumb_uri"};
        return new CursorLoader(this.f50951a.getContext(), uri, strArr, null, new String[0], null);
    }
}
