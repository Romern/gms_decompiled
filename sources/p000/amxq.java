package p000;

import android.accounts.Account;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.OperationApplicationException;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.TransactionTooLargeException;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONException;

/* renamed from: amxq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amxq extends amxs {

    /* renamed from: a */
    private final amyt f76322a;

    /* renamed from: b */
    private final amyn f76323b;

    /* renamed from: c */
    private final amwl f76324c;

    /* renamed from: d */
    private final sqv f76325d;

    /* renamed from: e */
    private final amvt f76326e;

    /* renamed from: f */
    private final alsj f76327f;

    /* renamed from: g */
    private final amwt f76328g;

    /* renamed from: m */
    private final amyo f76329m;

    /* renamed from: n */
    private final amxk f76330n;

    /* renamed from: o */
    private final amxu f76331o;

    /* renamed from: p */
    private final amxl f76332p;

    /* renamed from: q */
    private final bmxv f76333q;

    /* renamed from: r */
    private final bmxv f76334r;

    public amxq(amwt amwt, amwl amwl, ContentResolver contentResolver, amyt amyt, Account account, anaz anaz, amvm amvm, sqv sqv, alsj alsj, anav anav, bmxv bmxv, bmxv bmxv2) {
        super(contentResolver, account, anaz, anav, amvm);
        this.f76328g = amwt;
        this.f76322a = amyt;
        this.f76324c = amwl;
        this.f76323b = new amyn(contentResolver, account, amvm);
        this.f76325d = sqv;
        this.f76327f = alsj;
        this.f76326e = new amvt(account, contentResolver, anaz);
        this.f76329m = new amyo(contentResolver, account, this.f76326e, anaz);
        amye amye = new amye();
        this.f76330n = new amxk(this.f76329m, amwt, this.f76326e, anaz, bmxv2, amye, amvm);
        this.f76331o = new amxu(this.f76329m, amwt, this.f76326e, anaz, amvm, this.f76323b, amye);
        this.f76332p = new amxl(this.f76329m, amwt, this.f76326e, anaz, amye);
        this.f76333q = bmxv;
        this.f76334r = bmxv2;
    }

    /* renamed from: a */
    private static int m63684a(bmxv bmxv) {
        return ((Integer) bmxv.mo66812a((Object) -1)).intValue();
    }

    /* renamed from: c */
    private final boolean m63689c() {
        if (!this.f76334r.mo66813a()) {
            return false;
        }
        amig.m62939a();
        return ((Boolean) amgd.f74880a.mo41191a()).booleanValue();
    }

    /* renamed from: d */
    private final void m63690d() {
        if (m63689c()) {
            ((amxh) this.f76334r.mo66814b()).mo41524e(1);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
     arg types: [amyi, java.util.ArrayList]
     candidates:
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amvu.a(android.net.Uri, java.lang.Long, android.content.ContentValues, boolean, boolean):void
     arg types: [android.net.Uri, java.lang.Long, android.content.ContentValues, int, int]
     candidates:
      amvu.a(android.net.Uri, android.content.ContentValues, java.lang.Long, java.lang.Integer, boolean):int
      amvu.a(android.net.Uri, java.lang.Long, android.content.ContentValues, boolean, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amwt.a(java.util.LinkedHashMap, boolean):btbx[]
     arg types: [java.util.LinkedHashMap, int]
     candidates:
      amwt.a(bler, java.lang.String):amvp
      amwt.a(java.util.LinkedHashMap, btbx[]):amws
      amwt.a(java.util.List, java.lang.String):void
      amwr.a(java.util.List, int):void
      amwr.a(java.lang.String, int):byte[]
      amwt.a(java.util.LinkedHashMap, boolean):btbx[] */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x037e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03e8, code lost:
        r0 = r10.f76294c;
        r9 = p000.amnj.f75484c.mo74144da();
        r11 = ((p000.amvp) r5.getKey()).f76095d.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03fe, code lost:
        if (r9.f164950c == false) goto L_0x0400;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0401, code lost:
        r9.mo74035c();
        r9.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0407, code lost:
        r5 = (p000.amnj) r9.f164949b;
        r5.f75486a |= 1;
        r5.f75487b = r11;
        r0.mo41638a((p000.amnj) r9.mo74062i());
     */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x037e A[ExcHandler: amxy | gid | JSONException (e java.lang.Throwable), Splitter:B:130:0x0367] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03e8 A[Catch:{ all -> 0x0421, amxy | gid | JSONException -> 0x01fc, all -> 0x0426 }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x041e A[Catch:{ all -> 0x0421, amxy | gid | JSONException -> 0x01fc, all -> 0x0426 }] */
    /* renamed from: b */
    public final void mo41550b() {
        amvw a;
        int i;
        amxk amxk;
        Exception exc;
        Long l;
        int i2;
        int i3;
        List list;
        this.f76342l.mo41626a();
        try {
            boolean c = m63689c();
            try {
                amyn amyn = this.f76323b;
                ContentResolver contentResolver = amyn.f76380a;
                Account account = amyn.f76381b;
                bnic bnic = amyn.f76392e;
                String[] strArr = amvt.f76137a;
                a = amvw.m63489a(contentResolver, account, bnic, "data_set IS NULL AND (sourceid IS NULL OR dirty != 0 OR deleted != 0)", null);
                EnumMap enumMap = new EnumMap(amyi.class);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                amig.m62939a();
                int intValue = ((Integer) amhw.f74925a.mo41191a()).intValue();
                int i4 = 0;
                while (true) {
                    amvp a2 = a.mo41464b();
                    if (a2 != null) {
                        if (i4 >= intValue) {
                            break;
                        }
                        amyn.f76382c.mo41389a();
                        if (a2.f76099h) {
                            arrayList3.add(a2);
                        } else if (!amyn.m63729a(a2)) {
                            if (a2.f76092a == null) {
                                arrayList.add(a2);
                            } else if (a2.f76098g) {
                                arrayList2.add(a2);
                            }
                        }
                        i4++;
                    } else {
                        break;
                    }
                }
                enumMap.put((Object) amyi.INSERTED, (Object) arrayList);
                enumMap.put((Object) amyi.UPDATED, (Object) arrayList2);
                enumMap.put((Object) amyi.DELETED, (Object) arrayList3);
                amyn.mo41560a(amvt.m63471a(ContactsContract.RawContacts.CONTENT_URI, amyn.f76381b), "data_set IS NULL");
                arrayList3.size();
                a.mo41472f();
                List list2 = (List) enumMap.get(amyi.INSERTED);
                List<amvp> list3 = (List) enumMap.get(amyi.UPDATED);
                List<amvp> list4 = (List) enumMap.get(amyi.DELETED);
                int size = list4.size() + list2.size() + list3.size();
                if (size != 0) {
                    if (c) {
                        int size2 = list2.size() + list3.size();
                        amig.m62939a();
                        if (((Boolean) amgf.f74882a.mo41191a()).booleanValue()) {
                            size2 += list4.size();
                        }
                        ((amxh) this.f76334r.mo66814b()).mo41510a(size2);
                    }
                    this.f76341k.mo41389a();
                    this.f76341k.mo41389a();
                    amxk = this.f76330n;
                    amxk.f76294c.mo41636a(ammz.INSERT, amjf.CONTACT, false, 1, list2.size());
                    int size3 = list2.size();
                    int intValue2 = Integer.valueOf((int) cfvk.f185780a.mo6606a().mo83027d()).intValue();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int i5 = 0;
                    while (i5 < size3) {
                        int i6 = i5 + intValue2;
                        List<amvp> subList = list2.subList(i5, Math.min(i6, size3));
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (amvp amvp : subList) {
                            String str = amvp.f76094c;
                            if (str != null) {
                                try {
                                    l = Long.valueOf(Long.parseLong(str, 16));
                                } catch (NumberFormatException e) {
                                    l = null;
                                }
                            } else {
                                l = null;
                            }
                            if (l == null) {
                                Long valueOf = Long.valueOf((new SecureRandom().nextLong() & 9223372034841509887L) | 134217728);
                                amvv amvv = amxk.f76293b.f76138b;
                                list = list2;
                                Long l2 = amvp.f76095d;
                                long longValue = valueOf.longValue();
                                ContentValues contentValues = new ContentValues();
                                i3 = size;
                                i2 = size3;
                                contentValues.put("sync2", Long.toHexString(longValue));
                                amvv.mo41456a(amvv.f76144a, l2, contentValues, false, false);
                                amvt.m63473a(amvv.f76147c, amvv.f76145b);
                                l = valueOf;
                            } else {
                                list = list2;
                                i3 = size;
                                i2 = size3;
                            }
                            linkedHashMap2.put(amvp, l);
                            list2 = list;
                            size = i3;
                            size3 = i2;
                        }
                        List list5 = list2;
                        int i7 = size;
                        int i8 = size3;
                        if (linkedHashMap2.size() != 1) {
                            try {
                                if (cfwp.m143312b()) {
                                    amxk.f76296e.mo41389a();
                                }
                                amws a3 = amxk.f76292a.mo41504a(linkedHashMap2);
                                amxk.mo41546a(a3.f76220a);
                                linkedHashMap2 = a3.f76221b;
                            } catch (chuw e2) {
                            }
                            linkedHashMap.putAll(linkedHashMap2);
                        } else {
                            linkedHashMap.putAll(linkedHashMap2);
                        }
                        i5 = i6;
                        list2 = list5;
                        size = i7;
                        size3 = i8;
                    }
                    int i9 = size;
                    if (!linkedHashMap.isEmpty()) {
                        int size4 = linkedHashMap.size();
                        StringBuilder sb = new StringBuilder(57);
                        sb.append("BulkInsertContacts single inserting ");
                        sb.append(size4);
                        sb.append(" contacts.");
                        sb.toString();
                    }
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        try {
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap(bnhe.m109408a((amvp) entry.getKey(), (Long) entry.getValue()));
                            try {
                                if (cfwp.m143312b()) {
                                    amxk.f76296e.mo41389a();
                                }
                                amxk.mo41545a(amxk.f76292a.mo41504a(linkedHashMap3));
                            } catch (chuw e3) {
                                amye amye = amxk.f76295d;
                                alvf alvf = alvf.BULK_INSERT;
                                chuv chuv = e3.f189236a;
                                int a4 = amye.mo41556a(alvf, chuv.f189233s.f189211r, chuv.f189234t);
                                int i10 = a4 - 1;
                                if (a4 == 0) {
                                    throw null;
                                } else if (i10 == 5) {
                                    if (cfwp.m143312b()) {
                                        amxk.f76296e.mo41389a();
                                    }
                                    amxk.mo41545a(amxk.f76292a.mo41505a(linkedHashMap3, amwt.m63566a(linkedHashMap3, true)));
                                } else {
                                    throw e3;
                                }
                            } catch (amxy | gid | JSONException e4) {
                            } catch (chuw e5) {
                                e = e5;
                                exc = e;
                                amyg.m63718a(false, amjf.CONTACT, ammz.INSERT, exc, amxk.f76294c, 1);
                                if (cfwy.m143342b()) {
                                }
                            } catch (amxy | chuw | gid | JSONException e6) {
                                e = e6;
                            }
                        } catch (amxy | chuw | gid | JSONException e7) {
                            e = e7;
                            exc = e;
                            amyg.m63718a(false, amjf.CONTACT, ammz.INSERT, exc, amxk.f76294c, 1);
                            if (cfwy.m143342b()) {
                            }
                        }
                    }
                    this.f76341k.mo41389a();
                    for (amvp amvp2 : list3) {
                        if (this.f76331o.mo41529a(amvp2)) {
                            m63690d();
                        }
                    }
                    this.f76341k.mo41389a();
                    if (cfvr.f185802a.mo6606a().mo82797a()) {
                        amxl amxl = this.f76332p;
                        amxl.f76278d.mo41636a(amxl.f76275a, amjf.CONTACT, false, 1, list4.size());
                        ArrayList arrayList4 = new ArrayList();
                        for (amvp amvp3 : list4) {
                            if (amxl.mo41530b(amvp3)) {
                                arrayList4.add(amvp3);
                            }
                        }
                        int b = amxl.mo41547b(arrayList4);
                        if (b <= 0) {
                            if (cfwy.m143342b()) {
                                Iterator it = arrayList4.iterator();
                                while (it.hasNext()) {
                                    amxl.f76278d.mo41638a(amxi.m63635f((amvp) it.next()));
                                }
                                b = 0;
                            } else {
                                b = 0;
                            }
                        }
                        if (b > 0) {
                            amig.m62939a();
                            if (((Boolean) amgf.f74882a.mo41191a()).booleanValue() && m63689c()) {
                                ((amxh) this.f76334r.mo66814b()).mo41524e(b);
                            }
                        }
                    } else {
                        for (amvp amvp4 : list4) {
                            if (this.f76332p.mo41529a(amvp4)) {
                                amig.m62939a();
                                if (((Boolean) amgf.f74882a.mo41191a()).booleanValue()) {
                                    m63690d();
                                }
                            }
                        }
                    }
                    if (c) {
                        ((amxh) this.f76334r.mo66814b()).mo41525g();
                    }
                    i = i9;
                } else if (c) {
                    ((amxh) this.f76334r.mo66814b()).mo41525g();
                    i = 0;
                } else {
                    i = 0;
                }
                this.f76342l.mo41627a("FSA_contactSyncUp", i);
            } catch (amxy | gid | JSONException e8) {
                amyg.m63718a(false, amjf.CONTACT, ammz.INSERT, e8, amxk.f76294c, 1);
            } catch (Throwable th) {
                if (c) {
                    ((amxh) this.f76334r.mo66814b()).mo41525g();
                }
                throw th;
            }
        } catch (Throwable th2) {
            this.f76342l.mo41627a("FSA_contactSyncUp", 0);
            throw th2;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: alsj.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      alsj.a(java.lang.String, java.lang.String):java.lang.String
      alsj.a(java.lang.String, int):void
      alsj.a(java.lang.String, long):void
      alsj.a(java.lang.String, boolean):void */
    /* renamed from: a */
    private final void m63685a(amyc amyc) {
        amig.m62939a();
        Exception exc = amyc.f76366a;
        if (exc instanceof OperationApplicationException) {
            String af = cfvk.f185780a.mo6606a().mo82968af();
            String message = ((OperationApplicationException) exc).getMessage();
            if (message != null && Pattern.compile(af).matcher(message).find()) {
                this.f76327f.mo40683a(this.f76339i.name, true);
            }
        } else if (((Boolean) amfn.f74864a.mo41191a()).booleanValue() && (amyc.f76366a instanceof TransactionTooLargeException)) {
            this.f76327f.mo40683a(this.f76339i.name, true);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amxq.a(java.lang.Exception, boolean):boolean
     arg types: [java.lang.NullPointerException, boolean]
     candidates:
      amxq.a(java.lang.NullPointerException, boolean):void
      amxq.a(boolean, boolean):void
      amxq.a(java.lang.Exception, boolean):boolean */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: alsj.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      alsj.a(java.lang.String, java.lang.String):java.lang.String
      alsj.a(java.lang.String, int):void
      alsj.a(java.lang.String, long):void
      alsj.a(java.lang.String, boolean):void */
    /* renamed from: a */
    private final void m63686a(NullPointerException nullPointerException, boolean z) {
        if (m63688a((Exception) nullPointerException, z)) {
            this.f76327f.mo40683a(this.f76339i.name, true);
        }
    }

    /* renamed from: a */
    private final void m63687a(boolean z, boolean z2) {
        try {
            this.f76326e.mo41451b();
        } catch (amyc e) {
            if (z) {
                m63685a(e);
            }
            throw e;
        } catch (NullPointerException e2) {
            if (z) {
                m63686a(e2, z2);
            }
            throw e2;
        }
    }

    /* renamed from: a */
    private static boolean m63688a(Exception exc, boolean z) {
        if (exc instanceof NullPointerException) {
            amig.m62939a();
            String a = cfvk.f185780a.mo6606a().mo82936a();
            String message = exc.getMessage();
            if (!z || message == null || !message.contains(a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amyo.a(anad, boolean):void
     arg types: [anad, int]
     candidates:
      amyo.a(amvp, amvp):void
      amyo.a(anad, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: alsj.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      alsj.a(java.lang.String, java.lang.String):java.lang.String
      alsj.a(java.lang.String, int):void
      alsj.a(java.lang.String, long):void
      alsj.a(java.lang.String, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0311  */
    /* renamed from: a */
    public final void mo41554a() {
        anao anao;
        Object obj;
        anao a;
        this.f76342l.mo41626a();
        amig.m62939a();
        boolean booleanValue = Boolean.valueOf(cfvk.f185780a.mo6606a().mo82967ae()).booleanValue();
        boolean booleanValue2 = Boolean.valueOf(cfvk.f185780a.mo6606a().mo83014bo()).booleanValue();
        anaf anaf = new anaf(this.f76328g, this.f76324c, this.f76322a, this.f76341k, ContactsContract.RawContacts.CONTENT_URI, this.f76340j, this.f76327f, this.f76339i.name);
        amig.m62939a();
        int i = 0;
        boolean z = this.f76333q.mo66813a() && ((Boolean) amga.f74877a.mo41191a()).booleanValue();
        try {
            int intValue = ((Integer) amfo.f74865a.mo41191a()).intValue();
            anaq anaq = new anaq(intValue);
            new anak(anaf, this.f76341k, anaq).mo41594a();
            anaq anaq2 = new anaq(intValue);
            this.f76323b.mo41561a(anaq, anaq2);
            int i2 = 0;
            loop0:
            while (true) {
                this.f76341k.mo41389a();
                if (cfwa.f185820a.mo6606a().mo82817f()) {
                    while (true) {
                        a = anaq2.mo41604a(cfwa.m143264c(), TimeUnit.SECONDS);
                        if (a != null) {
                            break;
                        }
                        this.f76341k.mo41389a();
                    }
                    anao = a;
                } else {
                    anao = anaq2.mo41603a();
                }
                anaq2.mo41607b();
                for (anad anad : anao.mo41596a()) {
                    this.f76341k.mo41389a();
                    amvp amvp = (amvp) anad.f76464b;
                    if (amvp == null || (!TextUtils.equals(amvp.f76093b, ((amvp) anad.f76463a).f76093b))) {
                        this.f76329m.mo41567a(anad, true);
                        if (booleanValue) {
                            alsj alsj = this.f76327f;
                            String str = this.f76339i.name;
                            SharedPreferences sharedPreferences = alsj.f74200a;
                            String valueOf = String.valueOf(str);
                            if (sharedPreferences.getBoolean(valueOf.length() == 0 ? new String("focus_sync_write_cp2_per_each_contact_") : "focus_sync_write_cp2_per_each_contact_".concat(valueOf), false)) {
                                try {
                                    this.f76326e.mo41451b();
                                } catch (amyc e) {
                                    if (booleanValue) {
                                        m63685a(e);
                                    }
                                    throw e;
                                } catch (NullPointerException e2) {
                                    if (booleanValue) {
                                        m63686a(e2, booleanValue2);
                                    }
                                    throw e2;
                                } catch (amyc | NullPointerException e3) {
                                    if (!m63688a(e3, booleanValue2)) {
                                        amig.m62939a();
                                        if (!((Boolean) amfn.f74864a.mo41191a()).booleanValue() || !(e3 instanceof amyc) || !(((amyc) e3).f76366a instanceof TransactionTooLargeException)) {
                                            throw e3;
                                        }
                                    }
                                    amdk.m62659b("FSA2_RawContactSyncer", "Exception when writing contact to CP2, api contact: %s, local contact: %s", anad.f76463a, anad.f76464b);
                                    ((anbh) this.f76340j).f76541a.stats.numIoExceptions++;
                                    this.f76340j.mo41636a(ammz.UPDATE, amjf.CONTACT, true, 2, 1);
                                    this.f76340j.mo41632a(amjf.CONTACT, ammz.UPDATE, !(e3 instanceof NullPointerException) ? "TransactionTooLargeException" : "NPE_toLowerCase", e3);
                                } catch (Throwable th) {
                                    th = th;
                                    i = i2;
                                    if (z) {
                                        ((amxe) this.f76333q.mo66814b()).mo41525g();
                                    }
                                    this.f76342l.mo41627a("FSA_contactSyncDown", i);
                                    throw th;
                                }
                            }
                        }
                        this.f76326e.mo41449a();
                    } else {
                        amig.m62939a();
                        if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo82987ay()).booleanValue()) {
                            this.f76340j.mo41636a(ammz.UPDATE, amjf.CONTACT, true, 1, 1);
                            this.f76340j.mo41636a(ammz.UPDATE, amjf.CONTACT, true, 3, 1);
                        }
                        if (((Boolean) amfv.f74872a.mo41191a()).booleanValue() && (obj = anad.f76464b) != null) {
                            amvp amvp2 = (amvp) obj;
                            if (!amvp2.f76098g) {
                                bmxv a2 = amzx.m63797a(((amvp) anad.f76463a).f76091K, amvp2.f76091K);
                                if (a2.mo66813a()) {
                                    anay anay = (anay) a2.mo66814b();
                                    if (anay.mo41621b() != 0) {
                                        anay.mo41620a().name();
                                        this.f76340j.mo41635a(ammz.UPDATE, amjf.CONTACT, anay, 2);
                                    } else {
                                        throw null;
                                    }
                                }
                            }
                        }
                    }
                    if (z) {
                        ((amxe) this.f76333q.mo66814b()).mo41524e(1);
                    }
                    i2++;
                }
                if (!anao.mo41598c()) {
                    String b = anao.mo41597b();
                    m63687a(booleanValue, booleanValue2);
                    amwl amwl = this.f76324c;
                    amvh a3 = amwl.f76191a.mo41492a();
                    bxvd bxvd = (bxvd) a3.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) a3);
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    amvh amvh = (amvh) bxvd.f164949b;
                    amvh amvh2 = amvh.f76004g;
                    b.getClass();
                    amvh.f76006a = 2 | amvh.f76006a;
                    amvh.f76008c = b;
                    amwl.mo41488a((amvh) bxvd.mo74062i());
                    this.f76340j.mo41639b();
                } else {
                    String b2 = anao.mo41597b();
                    m63687a(booleanValue, booleanValue2);
                    this.f76324c.mo41489a(b2);
                    this.f76340j.mo41639b();
                    if (booleanValue) {
                        this.f76327f.mo40683a(this.f76339i.name, false);
                    }
                    this.f76322a.mo41574a(ContactsContract.RawContacts.CONTENT_URI);
                    amyt amyt = this.f76322a;
                    long currentTimeMillis = System.currentTimeMillis();
                    amig.m62939a();
                    int intValue2 = Integer.valueOf((int) cfvk.f185780a.mo6606a().mo83030g()).intValue();
                    Uri a4 = amvt.m63471a(ContactsContract.RawContacts.CONTENT_URI, amyt.f76410a);
                    StringBuilder sb = new StringBuilder(71);
                    sb.append("sourceid IS NULL AND sync3 IS NOT NULL AND sync3 < ");
                    sb.append(currentTimeMillis - (((long) intValue2) * 1000));
                    ContentProviderOperation build = ContentProviderOperation.newUpdate(a4).withValue("sync3", null).withSelection(sb.toString(), null).build();
                    build.toString().replace("%40g", "%%40g");
                    amyt.mo41573a(build, "clearFlagForFailedInsertedContacts");
                    if (z) {
                        ((amxe) this.f76333q.mo66814b()).mo41525g();
                    }
                    this.f76342l.mo41627a("FSA_contactSyncDown", i2);
                    return;
                }
            }
            throw e3;
        } catch (Throwable th2) {
            th = th2;
            if (z) {
            }
            this.f76342l.mo41627a("FSA_contactSyncDown", i);
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo41549a(amkb amkb) {
        try {
            amyn amyn = this.f76323b;
            Uri uri = ContactsContract.RawContacts.CONTENT_URI;
            Account account = amyn.f76381b;
            String[] strArr = amvt.f76137a;
            this.f76340j.mo41631a(amjf.CONTACT, amkb, amjd.CP2, amyn.mo41560a(uri.buildUpon().appendQueryParameter("account_name", account.name).appendQueryParameter("account_type", account.type).appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("visible_contacts_only", "true").build(), "data_set IS NULL AND deleted = 0"));
            if (cfwv.f185860a.mo6606a().mo82846b() && amkb == amkb.AFTER_SYNC) {
                Log.i("FSA2_RawContactSyncer", amdk.m62653a("contact count. before sweep: %d, before sync: %d, after sync down: %d, after sync up: %d", Integer.valueOf(m63684a(this.f76340j.mo41630a(amjf.CONTACT, amkb.BEFORE_PREPARE_TO_SYNC, amjd.CP2))), Integer.valueOf(m63684a(this.f76340j.mo41630a(amjf.CONTACT, amkb.BEFORE_SYNC, amjd.CP2))), Integer.valueOf(m63684a(this.f76340j.mo41630a(amjf.CONTACT, amkb.BETWEEN_SYNC_DOWN_AND_SYNC_UP, amjd.CP2))), Integer.valueOf(m63684a(this.f76340j.mo41630a(amjf.CONTACT, amkb.AFTER_SYNC, amjd.CP2)))));
            }
        } catch (amyc e) {
            this.f76340j.mo41631a(amjf.CONTACT, amkb, amjd.CP2, -1);
        }
    }
}
