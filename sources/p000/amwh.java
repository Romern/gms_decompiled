package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: amwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amwh {

    /* renamed from: a */
    public static final /* synthetic */ int f76172a = 0;

    /* renamed from: e */
    private static final String[] f76173e = {"_id", "title", "account_type"};

    /* renamed from: f */
    private static final String[] f76174f = {"_id", "title", "account_type", "data_set"};

    /* renamed from: b */
    private final almg f76175b;

    /* renamed from: c */
    private final ContentResolver f76176c;

    /* renamed from: d */
    private final Account f76177d;

    /* renamed from: g */
    private final amym f76178g;

    /* renamed from: h */
    private final bxvd f76179h;

    public amwh(ContentResolver contentResolver, almg almg, Account account, anaz anaz, bxvd bxvd) {
        amym amym = new amym(new amvt(account, contentResolver, anaz, false), account, contentResolver);
        this.f76176c = contentResolver;
        this.f76175b = almg;
        this.f76177d = account;
        this.f76179h = bxvd;
        this.f76178g = amym;
    }

    /* renamed from: a */
    public final amvy mo41480a(String str) {
        String[] strArr;
        if (cfxe.m143366e()) {
            strArr = f76174f;
        } else {
            strArr = f76173e;
        }
        ContentResolver contentResolver = this.f76176c;
        Uri uri = ContactsContract.Groups.CONTENT_URI;
        String[] strArr2 = amvt.f76137a;
        return amvy.m63506b(contentResolver, uri, strArr, str, null, "_id");
    }

    /* renamed from: a */
    public final Map mo41481a(amvy amvy) {
        TreeMap d = bnmt.m109810d();
        while (true) {
            try {
                amvr a = amvy.mo41464b();
                if (a == null) {
                    break;
                } else if (this.f76175b.mo40506a(a.mo41409o(), a.mo41410p()).f81698c == allz.DEVICE) {
                    d.put(a.mo41400g(), a.mo41406l());
                }
            } catch (Throwable th) {
                if (amvy != null) {
                    amvy.mo41472f();
                }
                throw th;
            }
        }
        if (amvy != null) {
            amvy.mo41472f();
        }
        return d;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnkn.a(java.util.List, bmxj):java.util.List
     arg types: [java.util.ArrayList, bmxj]
     candidates:
      bnkn.a(java.util.List, int):java.util.List
      bnkn.a(java.util.List, java.lang.Object):boolean
      bnkn.a(java.util.List, bmxj):java.util.List */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x022f, code lost:
        if (r25 == false) goto L_0x0231;
     */
    /* renamed from: a */
    public final void mo41482a(Map map, boolean z) {
        int i;
        amvy b;
        Map map2 = map;
        try {
            Collection values = map.values();
            TreeMap d = bnmt.m109810d();
            if (!values.isEmpty()) {
                ContentResolver contentResolver = this.f76176c;
                Uri a = amvt.m63471a(ContactsContract.Groups.CONTENT_URI, this.f76177d);
                StringBuilder sb = new StringBuilder();
                sb.append("title IN (");
                String join = TextUtils.join("\",\"", values);
                StringBuilder sb2 = new StringBuilder(String.valueOf(join).length() + 2);
                sb2.append("\"");
                sb2.append(join);
                sb2.append("\"");
                sb.append(sb2.toString());
                sb.append(")");
                b = amvy.m63506b(contentResolver, a, null, sb.toString(), null, "title");
                while (true) {
                    amvr a2 = b.mo41464b();
                    if (a2 == null) {
                        break;
                    }
                    d.put(a2.mo41406l(), a2.mo41400g());
                }
                b.mo41472f();
            }
            TreeMap d2 = bnmt.m109810d();
            for (Long l : map.keySet()) {
                String str = (String) map2.get(l);
                if (d.containsKey(str)) {
                    d2.put(l, (Long) d.get(str));
                }
            }
            try {
                TreeMap d3 = bnmt.m109810d();
                for (Long l2 : map.keySet()) {
                    String str2 = (String) map2.get(l2);
                    if (!d2.containsKey(l2)) {
                        if (d3.containsKey(str2)) {
                            d2.put(l2, (Long) d3.get(str2));
                        } else if (z) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("title", str2);
                            contentValues.put("group_visible", (Integer) 1);
                            Uri a3 = amvt.m63472a(ContactsContract.Groups.CONTENT_URI, this.f76177d, false);
                            Uri insert = this.f76176c.insert(a3, contentValues);
                            if (insert != null) {
                                Long valueOf = Long.valueOf(ContentUris.parseId(insert));
                                d2.put(l2, valueOf);
                                d3.put(str2, valueOf);
                                bxvd bxvd = this.f76179h;
                                int i2 = ((ammt) bxvd.f164949b).f75382e + 1;
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                ammt ammt = (ammt) bxvd.f164949b;
                                ammt ammt2 = ammt.f75376n;
                                ammt.f75378a |= 16;
                                ammt.f75382e = i2;
                            } else {
                                String valueOf2 = String.valueOf(a3);
                                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 58);
                                sb3.append("ContentResolver.insert returns null Uri. Uri to insert: %s");
                                sb3.append(valueOf2);
                                throw new RemoteException(sb3.toString());
                            }
                        } else {
                            long longValue = l2.longValue();
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("account_name", this.f76177d.name);
                            contentValues2.put("account_type", this.f76177d.type);
                            contentValues2.putNull("sourceid");
                            Uri withAppendedId = ContentUris.withAppendedId(ContactsContract.Groups.CONTENT_URI, longValue);
                            ContentResolver contentResolver2 = this.f76176c;
                            String[] strArr = amvt.f76137a;
                            contentResolver2.update(withAppendedId, contentValues2, "system_id IS NULL AND group_is_read_only IS 0", null);
                            d3.put(str2, l2);
                            bxvd bxvd2 = this.f76179h;
                            int i3 = ((ammt) bxvd2.f164949b).f75381d + 1;
                            if (bxvd2.f164950c) {
                                bxvd2.mo74035c();
                                bxvd2.f164950c = false;
                            }
                            ammt ammt3 = (ammt) bxvd2.f164949b;
                            ammt ammt4 = ammt.f75376n;
                            ammt3.f75378a |= 4;
                            ammt3.f75381d = i3;
                        }
                    }
                }
                int i4 = 4;
                try {
                    long Q = cfxe.f185877a.mo6606a().mo82875Q();
                    int i5 = 0;
                    for (Map.Entry entry : d2.entrySet()) {
                        entry.getKey();
                        entry.getValue();
                        int a4 = this.f76178g.mo41565a(((Long) entry.getKey()).longValue(), ((Long) entry.getValue()).longValue(), Q);
                        if (a4 >= 0) {
                            i5 += a4;
                        }
                    }
                    if (i5 > 0) {
                        if (!z) {
                            bxvd bxvd3 = this.f76179h;
                            if (bxvd3.f164950c) {
                                bxvd3.mo74035c();
                                bxvd3.f164950c = false;
                            }
                            ammt ammt5 = (ammt) bxvd3.f164949b;
                            ammt ammt6 = ammt.f75376n;
                            ammt5.f75378a |= 512;
                            ammt5.f75387j = i5;
                        } else {
                            bxvd bxvd4 = this.f76179h;
                            if (bxvd4.f164950c) {
                                bxvd4.mo74035c();
                                bxvd4.f164950c = false;
                            }
                            ammt ammt7 = (ammt) bxvd4.f164949b;
                            ammt ammt8 = ammt.f75376n;
                            ammt7.f75378a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            ammt7.f75386i = i5;
                            if (!d2.isEmpty()) {
                                bxvd bxvd5 = this.f76179h;
                                int size = d2.size();
                                if (bxvd5.f164950c) {
                                    bxvd5.mo74035c();
                                    bxvd5.f164950c = false;
                                }
                                ammt ammt9 = (ammt) bxvd5.f164949b;
                                ammt ammt10 = ammt.f75376n;
                                ammt9.f75378a |= 128;
                                ammt9.f75385h = size;
                                return;
                            }
                            return;
                        }
                    }
                    Set keySet = d2.keySet();
                    Uri build = ContactsContract.Groups.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
                    ContentResolver contentResolver3 = this.f76176c;
                    String format = String.format("(%s) AND (_id in (%s))", "system_id IS NULL AND group_is_read_only IS 0", TextUtils.join(",", bnkn.m109668a((List) new ArrayList(keySet), amwg.f76171a)));
                    String[] strArr2 = amvt.f76137a;
                    int delete = contentResolver3.delete(build, format, null);
                    if (delete > 0) {
                        bxvd bxvd6 = this.f76179h;
                        if (bxvd6.f164950c) {
                            bxvd6.mo74035c();
                            bxvd6.f164950c = false;
                        }
                        ammt ammt11 = (ammt) bxvd6.f164949b;
                        ammt ammt12 = ammt.f75376n;
                        ammt11.f75378a |= 32;
                        ammt11.f75383f = delete;
                    }
                    if (d2.size() > delete) {
                        bxvd bxvd7 = this.f76179h;
                        int size2 = d2.size() - delete;
                        if (bxvd7.f164950c) {
                            bxvd7.mo74035c();
                            bxvd7.f164950c = false;
                        }
                        ammt ammt13 = (ammt) bxvd7.f164949b;
                        ammt ammt14 = ammt.f75376n;
                        ammt13.f75378a |= 64;
                        ammt13.f75384g = size2;
                    }
                } catch (RemoteException e) {
                    bxvd da = amms.f75372c.mo74144da();
                    if (z) {
                        i4 = 6;
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    amms amms = (amms) da.f164949b;
                    amms.f75375b = i4 - 1;
                    amms.f75374a = 1 | amms.f75374a;
                    amms amms2 = (amms) da.mo74062i();
                    bxvd bxvd8 = this.f76179h;
                    if (bxvd8.f164950c) {
                        bxvd8.mo74035c();
                        bxvd8.f164950c = false;
                    }
                    ammt ammt15 = (ammt) bxvd8.f164949b;
                    ammt ammt16 = ammt.f75376n;
                    amms2.getClass();
                    ammt15.f75389l = amms2;
                    ammt15.f75378a |= 2048;
                    throw e;
                }
            } catch (RemoteException e2) {
                bxvd bxvd9 = this.f76179h;
                bxvd da2 = amms.f75372c.mo74144da();
                int i6 = !z ? 3 : 5;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                amms amms3 = (amms) da2.f164949b;
                amms3.f75375b = i6 - 1;
                amms3.f75374a = 1 | amms3.f75374a;
                amms amms4 = (amms) da2.mo74062i();
                if (bxvd9.f164950c) {
                    bxvd9.mo74035c();
                    bxvd9.f164950c = false;
                }
                ammt ammt17 = (ammt) bxvd9.f164949b;
                ammt ammt18 = ammt.f75376n;
                amms4.getClass();
                ammt17.f75389l = amms4;
                ammt17.f75378a |= 2048;
                throw e2;
            }
        } catch (RemoteException e3) {
            bxvd bxvd10 = this.f76179h;
            bxvd da3 = amms.f75372c.mo74144da();
            if (!z) {
                i = 8;
            } else {
                i = 7;
            }
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            amms amms5 = (amms) da3.f164949b;
            amms5.f75375b = i - 1;
            amms5.f75374a = 1 | amms5.f75374a;
            if (bxvd10.f164950c) {
                bxvd10.mo74035c();
                bxvd10.f164950c = false;
            }
            ammt ammt19 = (ammt) bxvd10.f164949b;
            amms amms6 = (amms) da3.mo74062i();
            ammt ammt20 = ammt.f75376n;
            amms6.getClass();
            ammt19.f75389l = amms6;
            ammt19.f75378a |= 2048;
            throw e3;
        } catch (Throwable th) {
            b.mo41472f();
            throw th;
        }
    }
}
