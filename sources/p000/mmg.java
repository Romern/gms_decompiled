package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.provider.ContactsContract;
import com.felicanetworks.mfc.BuildConfig;
import java.io.Closeable;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: mmg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mmg implements mmh {

    /* renamed from: a */
    public static final lvn f34007a = new lvn("ContactsFlavorHandler");

    /* renamed from: b */
    public final lyz f34008b;

    public mmg(lyz lyz) {
        bmxy.m108581a(lyz);
        this.f34008b = lyz;
    }

    /* renamed from: a */
    public final InputStream mo20162a(mph mph) {
        return new mmt(new mmf(this));
    }

    /* renamed from: a */
    public final List mo20163a() {
        bssv bssv;
        bxvd da = mph.f34141f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mph mph = (mph) da.f164949b;
        "contacts".getClass();
        mph.f34143a |= 1;
        mph.f34146d = "contacts";
        try {
            lyz lyz = this.f34008b;
            bssv bssv2 = bssv.f146921b;
            lyx lyx = new lyx(lyz.f33232b);
            bxvd da2 = bssv.f146921b.mo74144da();
            if (!lyz.m24693d()) {
                lyx.f33226a.mo25416d("Doesn't have READ_CONTACTS permission, give up reading contacts metadata.", new Object[0]);
                bssv = (bssv) da2.mo74062i();
            } else {
                ContentResolver contentResolver = lyx.f33229c.getContentResolver();
                lyx.f33228d = new lyw(lyx.f33229c).mo19768a();
                HashMap hashMap = new HashMap();
                Cursor cursor = null;
                try {
                    cursor = contentResolver.query(ContactsContract.RawContacts.CONTENT_URI, lyx.f33227b, null, null, null);
                    if (cursor != null) {
                        while (cursor.moveToNext()) {
                            try {
                                String string = cursor.getString(cursor.getColumnIndex("account_type"));
                                if ("com.google".equals(string)) {
                                    lyx.m24692a(hashMap, BuildConfig.FLAVOR_client);
                                } else if (!lyx.f33228d.contains(string)) {
                                    if (string == null || !string.matches(".*sim.*|.*SIM.*")) {
                                        lyx.m24692a(hashMap, "local");
                                    } else {
                                        lyx.m24692a(hashMap, "sim");
                                    }
                                }
                            } catch (SQLiteException e) {
                                e = e;
                                try {
                                    lyx.f33226a.mo25417e("ContentResolver.query threw an exception when fetching raw-contacts.", e, new Object[0]);
                                    String valueOf = String.valueOf(e);
                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                                    sb.append("Fetching raw contacts query failed.");
                                    sb.append(valueOf);
                                    throw new lzb(sb.toString());
                                } catch (Throwable th) {
                                    th = th;
                                    srz.m36171a(cursor);
                                    throw th;
                                }
                            }
                        }
                        for (String str : hashMap.keySet()) {
                            bxvd da3 = bstf.f146999c.mo74144da();
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            str.getClass();
                            ((bstf) da3.f164949b).f147001a = str;
                            int intValue = ((Integer) hashMap.get(str)).intValue();
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            ((bstf) da3.f164949b).f147002b = intValue;
                            bstf bstf = (bstf) da3.mo74062i();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bssv bssv3 = (bssv) da2.f164949b;
                            bstf.getClass();
                            if (!bssv3.f146923a.mo73666a()) {
                                bssv3.f146923a = GeneratedMessageLite.m124021a(bssv3.f146923a);
                            }
                            bssv3.f146923a.add(bstf);
                        }
                        srz.m36171a(cursor);
                        bssv = (bssv) da2.mo74062i();
                    } else {
                        lyx.f33226a.mo25416d("Could not query ContactsProvider to fetch RawContacts; disabled? Give up.", new Object[0]);
                        throw new lza("Raw contacts query cursor is null");
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    lyx.f33226a.mo25417e("ContentResolver.query threw an exception when fetching raw-contacts.", e, new Object[0]);
                    String valueOf2 = String.valueOf(e);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 35);
                    sb2.append("Fetching raw contacts query failed.");
                    sb2.append(valueOf2);
                    throw new lzb(sb2.toString());
                } catch (Throwable th2) {
                    th = th2;
                    srz.m36171a(cursor);
                    throw th;
                }
            }
            ArrayList arrayList = new ArrayList();
            for (bstf bstf2 : bssv.f146923a) {
                bxvd da4 = mox.f34084d.mo74144da();
                String str2 = bstf2.f147001a;
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                mox mox = (mox) da4.f164949b;
                str2.getClass();
                int i = mox.f34086a | 1;
                mox.f34086a = i;
                mox.f34087b = str2;
                int i2 = bstf2.f147002b;
                mox.f34086a = i | 2;
                mox.f34088c = i2;
                arrayList.add((mox) da4.mo74062i());
            }
            bxvd da5 = moy.f34089b.mo74144da();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            moy moy = (moy) da5.f164949b;
            if (!moy.f34091a.mo73666a()) {
                moy.f34091a = GeneratedMessageLite.m124021a(moy.f34091a);
            }
            bxsy.m123078a(arrayList, moy.f34091a);
            moy moy2 = (moy) da5.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mph mph2 = (mph) da.f164949b;
            moy2.getClass();
            mph2.f34145c = moy2;
            mph2.f34144b = 101;
            int i3 = 0;
            for (bstf bstf3 : bssv.f146923a) {
                if ("local".equals(bstf3.f147001a) || "sim".equals(bstf3.f147001a)) {
                    i3 += bstf3.f147002b;
                }
            }
            long j = ((long) i3) * 4096;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mph mph3 = (mph) da.f164949b;
            mph3.f34143a |= 2;
            mph3.f34147e = j;
            return bngx.m109356a((mph) da.mo74062i());
        } catch (lza | lzb e3) {
            f34007a.mo25417e("Unable to fetch contacts", e3, new Object[0]);
            return bngx.m109376e();
        }
    }

    /* renamed from: a */
    public final void mo20164a(mph mph, InputStream inputStream) {
        srz.m36171a((Closeable) inputStream);
    }
}
