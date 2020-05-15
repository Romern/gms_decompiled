package p000;

import android.accounts.Account;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.text.TextUtils;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: amyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amyo {

    /* renamed from: a */
    protected final Set f76393a;

    /* renamed from: b */
    private final amvt f76394b;

    /* renamed from: c */
    private final anaz f76395c;

    public amyo(ContentResolver contentResolver, Account account, amvt amvt, anaz anaz) {
        HashSet hashSet;
        if (!amvy.m63505a(contentResolver, account)) {
            List<amvr> a = amvy.m63504a(contentResolver, account, amvy.f76153b);
            hashSet = new HashSet();
            for (amvr amvr : a) {
                if (!TextUtils.isEmpty(amvr.mo41404j())) {
                    hashSet.add(amvr.mo41404j());
                }
            }
        } else {
            hashSet = null;
        }
        this.f76393a = hashSet;
        this.f76394b = amvt;
        this.f76395c = anaz;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amyo.a(anad, boolean):void
     arg types: [anad, int]
     candidates:
      amyo.a(amvp, amvp):void
      amyo.a(anad, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0074, code lost:
        if (r12.f76101j == false) goto L_0x0077;
     */
    /* renamed from: a */
    public final void mo41566a(amvp amvp, amvp amvp2) {
        amig.m62939a();
        if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo82971ai()).booleanValue()) {
            if (!ancm.m64008a((Collection) amvp2.f76086F)) {
                List list = amvp2.f76086F;
                int size = list.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    ContentValues contentValues = (ContentValues) list.get(i);
                    long longValue = contentValues.getAsLong("data_version").longValue();
                    Long asLong = contentValues.getAsLong("data_sync4");
                    boolean d = anac.m63814d(contentValues);
                    boolean c = anac.m63813c(contentValues);
                    boolean z = !d && !anau.m63868a(Long.valueOf(longValue), asLong);
                    if (contentValues.get("data15") != null && (c || z)) {
                        break;
                    }
                    i++;
                }
            }
            if (!ancm.m64008a((Collection) amvp.f76086F)) {
            }
            mo41567a(new anad(amvp, amvp2), false);
            amvv amvv = this.f76394b.f76138b;
            amvv.mo41457a(amvv.f76144a, "dirty", amvp2.f76095d);
        }
        amvp[] amvpArr = {amvp, amvp2};
        for (int i2 = 0; i2 < 2; i2++) {
            amvp amvp3 = amvpArr[i2];
            if (amvp3 != null) {
                List list2 = amvp3.f76086F;
                if (list2 != null) {
                    list2.clear();
                }
                Iterator it = amvp3.f76091K.iterator();
                while (it.hasNext()) {
                    if (anac.m63810a((ContentValues) it.next())) {
                        it.remove();
                    }
                }
            }
        }
        mo41567a(new anad(amvp, amvp2), false);
        amvv amvv2 = this.f76394b.f76138b;
        amvv2.mo41457a(amvv2.f76144a, "dirty", amvp2.f76095d);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amvu.a(android.net.Uri, java.lang.Long, android.content.ContentValues, boolean):void
     arg types: [android.net.Uri, java.lang.Long, android.content.ContentValues, int]
     candidates:
      amvu.a(android.net.Uri, long, java.lang.String, java.lang.Long):void
      amvu.a(android.net.Uri, java.lang.String, java.lang.Long, boolean):void
      amvu.a(android.net.Uri, java.lang.Long, android.content.ContentValues, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amvu.a(java.lang.Long, boolean):void
     arg types: [java.lang.Long, int]
     candidates:
      amvu.a(java.lang.Long, android.content.ContentValues):void
      amvu.a(java.lang.Long, boolean):void */
    /* renamed from: a */
    public final void mo41567a(anad anad, boolean z) {
        Integer num;
        Long l;
        List list;
        amvp amvp = (amvp) anad.f76464b;
        amvp amvp2 = (amvp) anad.f76463a;
        sdo.m34959a(amvp2);
        amvv amvv = this.f76394b.f76138b;
        if (!amvp2.f76099h) {
            boolean z2 = false;
            if (this.f76393a != null) {
                List list2 = amvp2.f76111t;
                if (list2 != null) {
                    int size = list2.size();
                    int i = 0;
                    while (i < size) {
                        String asString = ((ContentValues) list2.get(i)).getAsString("group_sourceid");
                        i++;
                        if (this.f76393a.contains(asString)) {
                        }
                    }
                }
            }
            if (amvp != null) {
                if (z) {
                    this.f76395c.mo41636a(ammz.UPDATE, amjf.CONTACT, true, 1, 1);
                    if (amvp.f76098g) {
                        this.f76395c.mo41636a(ammz.UPDATE, amjf.CONTACT, true, 4, 1);
                    }
                }
                Long l2 = amvp.f76095d;
                sdo.m34959a(l2);
                amvv.mo41454a(amvv.f76144a, l2.longValue(), "version", amvp.f76097f);
                amvv.f76145b.mo41496a(ContentProviderOperation.newAssertQuery(ContentUris.withAppendedId(amvv.f76144a, l2.longValue())).withValue("starred", Integer.valueOf(amvp.f76100i ? 1 : 0)).withExpectedCount(1), false);
                amvv.mo41455a(amvv.f76144a, l2, amvp2.mo41440b(), false);
                l = l2;
                num = null;
            } else {
                if (z) {
                    this.f76395c.mo41636a(ammz.INSERT, amjf.CONTACT, true, 1, 1);
                }
                amvv.mo41459a(amvv.f76144a, "sourceid", amvp2.f76092a);
                ContentValues b = amvp2.mo41440b();
                amig.m62939a();
                num = Integer.valueOf(amvv.mo41453a(amvv.f76144a, b, !((Boolean) amfl.f74862a.mo41191a()).booleanValue()));
                l = null;
            }
            List list3 = amvp2.f76091K;
            if (amvp != null) {
                list = amvp.f76091K;
            } else {
                list = null;
            }
            amig.m62939a();
            if (((Boolean) amfu.f74871a.mo41191a()).booleanValue()) {
                if (!cfyb.f186091a.mo6606a().mo83064a()) {
                    z2 = true;
                } else if (((anbh) this.f76395c).f76549i) {
                    z2 = true;
                }
            }
            List a = anac.m63807a(list3, list, l, num, this.f76394b, this.f76395c, z, z2);
            if (z2 && z) {
                bmxv a2 = amzx.m63797a(list3, a);
                if (a2.mo66813a()) {
                    anay anay = (anay) a2.mo66814b();
                    if (anay.mo41621b() != 0) {
                        anay.mo41620a().name();
                        this.f76395c.mo41635a(amvp != null ? ammz.UPDATE : ammz.INSERT, amjf.CONTACT, anay, 1);
                        if (cfyb.f186091a.mo6606a().mo83065b() && amvp != null) {
                            amvv.mo41462a(amvp.f76095d);
                            return;
                        }
                        return;
                    }
                    throw null;
                }
                return;
            }
            return;
        }
        if (z) {
            this.f76395c.mo41636a(ammz.REMOVE, amjf.CONTACT, true, 1, 1);
        }
        if (amvp == null) {
            this.f76395c.mo41636a(ammz.REMOVE, amjf.CONTACT, z, 3, 1);
            return;
        }
        if (amvp.f76098g) {
            this.f76395c.mo41636a(ammz.REMOVE, amjf.CONTACT, z, 4, 1);
        }
        amvv.mo41461a(Long.valueOf(amvp.f76095d.longValue()), true);
    }
}
