package p000;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: aowc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aowc {

    /* renamed from: a */
    private final aowg f83722a;

    /* renamed from: b */
    private final aowa f83723b;

    /* renamed from: c */
    private final ClientContext f83724c;

    /* renamed from: d */
    private final ContentResolver f83725d;

    /* renamed from: e */
    private final aosi f83726e;

    /* renamed from: f */
    private final aowd f83727f;

    /* renamed from: g */
    private final int f83728g;

    public aowc(Context context, aowg aowg, aowa aowa, ClientContext clientContext, aosi aosi, int i) {
        this.f83722a = aowg;
        this.f83723b = aowa;
        this.f83724c = clientContext;
        this.f83726e = aosi;
        this.f83725d = context.getContentResolver();
        this.f83728g = i;
        this.f83727f = new aowd(context, aosi);
    }

    /* renamed from: a */
    static int m69680a(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z) {
            return 5;
        }
        if (z2) {
            return 4;
        }
        if (!z3) {
            return z4 ? 2 : 1;
        }
        return 3;
    }

    /* renamed from: b */
    private final boolean m69682b() {
        blpl blpl = null;
        Long l = null;
        boolean z = true;
        while (true) {
            bxvd da = blqj.f127345f.mo74144da();
            if (this.f83727f.mo46953b() != null) {
                blrk b = this.f83727f.mo46953b();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                blqj blqj = (blqj) da.f164949b;
                b.getClass();
                blqj.f127348b = b;
                blqj.f127347a |= 1;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blqj.m107471a((blqj) da.f164949b);
            bxvd da2 = blqy.f127421c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            blqy blqy = (blqy) da2.f164949b;
            blqy.f127424b = 2;
            blqy.f127423a |= 1;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blqj blqj2 = (blqj) da.f164949b;
            blqy blqy2 = (blqy) da2.mo74062i();
            blqy2.getClass();
            blqj2.f127350d = blqy2;
            blqj2.f127347a |= 1048576;
            if (blpl != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                blqj blqj3 = (blqj) da.f164949b;
                blpl.getClass();
                blqj3.f127351e = blpl;
                blqj3.f127347a |= 8388608;
            }
            blqk a = this.f83722a.mo46959a(this.f83724c, (blqj) da.mo74062i());
            if (z) {
                if ((a.f127355a & 4) != 0) {
                    l = Long.valueOf(a.f127358d);
                } else {
                    l = null;
                }
                String valueOf = String.valueOf(l);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                sb.append("First sync storageVersion:");
                sb.append(valueOf);
                sb.toString();
            }
            ArrayList arrayList = new ArrayList();
            bxwc bxwc = a.f127356b;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(this.f83727f.mo46951a((blrj) bxwc.get(i)));
            }
            boolean a2 = this.f83727f.mo46952a(arrayList);
            if ((a.f127355a & 2) != 0) {
                blpl = a.f127357c;
                if (blpl == null) {
                    blpl = blpl.f127242a;
                }
            } else {
                blpl = null;
            }
            String valueOf2 = String.valueOf(blpl);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 39);
            sb2.append("Continuation:");
            sb2.append(valueOf2);
            sb2.append(" Apply batch result: ");
            sb2.append(a2);
            sb2.toString();
            if (!a2) {
                return false;
            }
            if (blpl != null) {
                z = false;
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(m69681a(l.longValue()));
                arrayList2.add(this.f83727f.mo46949a());
                return this.f83727f.mo46952a(arrayList2);
            }
        }
    }

    /* renamed from: a */
    private final ContentProviderOperation m69681a(long j) {
        return ContentProviderOperation.newUpdate(ContentUris.withAppendedId(aosy.f83568a, this.f83726e.f83507a)).withValue("storage_version", Long.valueOf(j)).build();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x024a, code lost:
        if (r6 == 0) goto L_0x0253;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0251, code lost:
        if (r0 != false) goto L_0x0253;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0253, code lost:
        r0 = android.content.ContentUris.withAppendedId(p000.aosy.f83568a, r15.f83726e.f83507a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0265, code lost:
        if (p000.aowt.m69730a(p000.rpr.m34216b(), r0, "need_sync_snooze_preset") == false) goto L_0x02b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0267, code lost:
        r8 = p000.blpz.f127308a;
        r4 = r15.f83723b;
        r7 = r15.f83724c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x026f, code lost:
        if (p000.aowa.f83713c == null) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0272, code lost:
        p000.aowa.f83713c = p000.chtv.m149566a(p000.chtu.UNARY, "caribou.tasks.service.CustomizeSnoozePresetsService/GetSnoozePresets", p000.ciie.m150370a(p000.blpz.f127308a), p000.ciie.m150370a(p000.blqa.f127310c));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0288, code lost:
        r4 = (p000.blqa) r4.f83715a.mo25553a(p000.aowa.f83713c, r7, r8, (long) p000.aowa.f83712b, java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0297, code lost:
        if (r4 == null) goto L_0x02ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x029c, code lost:
        if ((r4.f127312a & 1) == 0) goto L_0x02ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x029e, code lost:
        r5 = new android.content.ContentValues();
        r4 = r4.f127313b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02a5, code lost:
        if (r4 != null) goto L_0x02a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02a7, code lost:
        r4 = p000.blpr.f127278d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02a9, code lost:
        p000.aowy.m69766a(r5, r4);
        r5.put("need_sync_snooze_preset", (java.lang.Boolean) false);
        r15.f83725d.update(r0, r5, null, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02b9, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02ba, code lost:
        return false;
     */
    /* renamed from: a */
    public final boolean mo46948a() {
        boolean z;
        int i;
        int a;
        Long l = this.f83726e.f83509c;
        if (l != null) {
            long longValue = l.longValue();
            boolean z2 = true;
            while (true) {
                i = 2;
                if (!z2) {
                    i = 0;
                    break;
                }
                bxvd da = blqc.f127316f.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                blqc blqc = (blqc) da.f164949b;
                blqc.f127318a |= 2;
                blqc.f127320c = longValue;
                if (this.f83727f.mo46953b() != null) {
                    blrk b = this.f83727f.mo46953b();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    blqc blqc2 = (blqc) da.f164949b;
                    b.getClass();
                    blqc2.f127319b = b;
                    blqc2.f127318a |= 1;
                }
                int i2 = this.f83728g;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                blqc blqc3 = (blqc) da.f164949b;
                blqc3.f127321d = i2 - 1;
                blqc3.f127318a |= 8;
                blqc blqc4 = (blqc) da.f164949b;
                blqc4.f127318a |= 32;
                blqc4.f127322e = true;
                aowg aowg = this.f83722a;
                ClientContext clientContext = this.f83724c;
                blqc blqc5 = (blqc) da.mo74062i();
                if (aowg.f83740f == null) {
                    aowg.f83740f = chtv.m149566a(chtu.UNARY, "caribou.tasks.service.TasksApiService/GetTaskHistory", ciie.m150370a(blqc.f127316f), ciie.m150370a(blqg.f127329e));
                }
                blqg blqg = (blqg) aowg.f83755a.mo25553a(aowg.f83740f, clientContext, blqc5, (long) aowg.f83736b, TimeUnit.MILLISECONDS);
                if (blqg.f127331a) {
                    i = 1;
                    break;
                }
                ArrayList arrayList = new ArrayList();
                HashMap hashMap = new HashMap();
                bxwc bxwc = blqg.f127332b;
                int size = bxwc.size();
                for (int i3 = 0; i3 < size; i3++) {
                    blqf blqf = (blqf) bxwc.get(i3);
                    if (blqf != null) {
                        int a2 = blqe.m107465a(blqf.f127326a);
                        if (a2 != 0 && a2 == 2) {
                            bxwc bxwc2 = blqf.f127327b;
                            int size2 = bxwc2.size();
                            for (int i4 = 0; i4 < size2; i4++) {
                                arrayList.add(this.f83727f.mo46950a((blox) bxwc2.get(i4)));
                            }
                        } else {
                            int a3 = blqe.m107465a(blqf.f127326a);
                            if (a3 == 0 || a3 == 1 || ((a = blqe.m107465a(blqf.f127326a)) != 0 && a == 3)) {
                                bxwc bxwc3 = blqf.f127327b;
                                int size3 = bxwc3.size();
                                for (int i5 = 0; i5 < size3; i5++) {
                                    blox blox = (blox) bxwc3.get(i5);
                                    hashMap.put(blox.f127163b, blox);
                                }
                            } else {
                                int a4 = blqe.m107465a(blqf.f127326a);
                                if (a4 != 0 && a4 == 4) {
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("need_sync_snooze_preset", (Boolean) true);
                                    arrayList.add(ContentProviderOperation.newUpdate(ContentUris.withAppendedId(aosy.f83568a, this.f83726e.f83507a)).withValues(contentValues).build());
                                }
                            }
                        }
                    }
                }
                if (!hashMap.isEmpty()) {
                    ClientContext clientContext2 = this.f83724c;
                    ArrayList arrayList2 = new ArrayList();
                    bxvd da2 = blqh.f127336d.mo74144da();
                    blrk b2 = this.f83727f.mo46953b();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    blqh blqh = (blqh) da2.f164949b;
                    b2.getClass();
                    blqh.f127339b = b2;
                    blqh.f127338a |= 1;
                    Collection values = hashMap.values();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    blqh blqh2 = (blqh) da2.f164949b;
                    blqh2.mo66689a();
                    bxsy.m123078a(values, blqh2.f127340c);
                    bxwc bxwc4 = this.f83722a.mo46958a(clientContext2, (blqh) da2.mo74062i()).f127343a;
                    int size4 = bxwc4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        blrj blrj = (blrj) bxwc4.get(i6);
                        if (blrj.f127466i) {
                            aowd aowd = this.f83727f;
                            blox blox2 = blrj.f127459b;
                            if (blox2 == null) {
                                blox2 = blox.f127160d;
                            }
                            arrayList2.add(aowd.mo46950a(blox2));
                        } else {
                            arrayList2.add(this.f83727f.mo46951a(blrj));
                        }
                        blox blox3 = blrj.f127459b;
                        if (blox3 == null) {
                            blox3 = blox.f127160d;
                        }
                        hashMap.remove(blox3.f127163b);
                    }
                    for (blox blox4 : hashMap.values()) {
                        arrayList2.add(this.f83727f.mo46950a(blox4));
                    }
                    arrayList.addAll(arrayList2);
                }
                long j = blqg.f127333c;
                arrayList.add(m69681a(j));
                if (!this.f83727f.mo46952a(arrayList)) {
                    break;
                }
                z2 = blqg.f127334d;
                longValue = j;
            }
            StringBuilder sb = new StringBuilder(31);
            sb.append("Forward sync result:");
            sb.append(i);
            sb.toString();
            if (i == 1) {
                aosf.m69447a(rpr.m34216b(), this.f83726e);
                z = m69682b();
            }
        } else {
            z = m69682b();
        }
    }
}
