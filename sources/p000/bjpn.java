package p000;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: bjpn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjpn extends bjon implements bjpo {

    /* renamed from: q */
    ArrayList f123094q;

    /* renamed from: r */
    public ArrayList f123095r;

    /* renamed from: s */
    public ArrayList f123096s;

    /* renamed from: t */
    public int[] f123097t;

    /* renamed from: u */
    private bwvl f123098u;

    /* renamed from: v */
    private List f123099v;

    /* renamed from: w */
    private long f123100w;

    public bjpn(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* renamed from: f */
    private final void m104230f(long j) {
        mo65124j();
        if (j != -1) {
            mo65107a(bjoo.m104169a(mo65437e(j).f123093l.f161123c, (bjhw) ((bjhy) this).f122754m));
        } else {
            mo65107a(this.f123099v);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final String mo65414G() {
        bwvl bwvl = this.f123098u;
        return bwvl.f161144a == 3 ? (String) bwvl.f161145b : "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final String mo65415H() {
        bwvl bwvl = this.f123098u;
        return bwvl.f161144a == 1 ? (String) bwvl.f161145b : "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final String mo65416I() {
        return this.f123098u.f161146c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final List mo65435J() {
        return ((bjpp) ((bjhy) this).f122754m).mo65438e() ? mo65437e(((bjpp) ((bjhy) this).f122754m).f123102f).f123093l.f161122b : this.f123098u.f161150g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65099a(bwny bwny, Bundle bundle) {
        mo65097a(new bjpr(this.f122639a));
        super.mo65099a(bwny, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bjhs mo65264b(bwny bwny) {
        bjpp bjpp = (bjpp) ((bjhy) this).f122754m;
        return bjpp == null ? new bjpp() : bjpp;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo65115c() {
        int size = this.f123098u.f161147d.size();
        for (int i = 0; i < size; i++) {
            this.f123095r.add(mo65437e(this.f123098u.f161147d.mo74160a(i)));
        }
        bjpp bjpp = (bjpp) ((bjhy) this).f122754m;
        bjpp.f123101e = this;
        String str = bjpp.f122753d;
        if (!TextUtils.isEmpty(str)) {
            mo65436a(str, "");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: cF */
    public final Iterable mo65118cF() {
        long j = ((bjpp) ((bjhy) this).f122754m).f123102f;
        return j != -1 ? bngx.m109356a(Long.valueOf(j)) : bngx.m109376e();
    }

    /* renamed from: e */
    public final bjpl mo65437e(long j) {
        return (bjpl) this.f122639a.f122693b.mo65131a(j, bjpl.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65100a(bwny bwny, bwny bwny2) {
        super.mo65100a(bwny, bwny2);
        bxvj bxvj = bwvl.f161142i;
        bwny2.mo74135a(bxvj);
        Object b = bwny2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        bwvl bwvl = (bwvl) b;
        this.f123098u = bwvl;
        int size = bwvl.f161147d.size();
        ArrayList arrayList = this.f123095r;
        if (arrayList != null) {
            arrayList.clear();
        } else {
            this.f123095r = new ArrayList(size);
        }
        int[] iArr = new int[size];
        this.f123097t = iArr;
        Arrays.fill(iArr, 0);
        bjpp bjpp = (bjpp) ((bjhy) this).f122754m;
        bjpp.f123103g = this.f123097t;
        bwvl bwvl2 = this.f123098u;
        this.f123099v = bngx.m109357a(new bjps(bjpp, bwvl2.f161149f, this.f122639a.f122696e.mo65197a()), new bjpt(bjpp, bwvl2.f161148e, this.f122639a.f122696e.mo65197a()));
        m104230f(((bjpp) ((bjhy) this).f122754m).f123102f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0106 A[LOOP:1: B:13:0x0034->B:58:0x0106, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0104 A[SYNTHETIC] */
    /* renamed from: a */
    public final void mo65436a(String str, String str2) {
        int i;
        int i2;
        int i3;
        long j;
        boolean z;
        String str3 = str;
        boolean z2 = str2 != null && str.startsWith(str2);
        this.f123100w = -1;
        int i4 = 0;
        boolean z3 = false;
        boolean z4 = false;
        int i5 = 0;
        while (true) {
            int[] iArr = this.f123097t;
            if (i4 >= iArr.length) {
                break;
            }
            int i6 = iArr[i4];
            if (!z2 || i6 == 0) {
                bxwc bxwc = ((bjpl) this.f123095r.get(i4)).f123093l.f161121a;
                int size = bxwc.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size) {
                        i6 = -1;
                        break;
                    }
                    bwvh bwvh = (bwvh) bxwc.get(i7);
                    int length = str.length();
                    int i8 = bwvh.f161128a;
                    long j2 = bwvh.f161129b;
                    long j3 = 0;
                    if (j2 != 0) {
                        String l = Long.toString(j2);
                        i2 = l.length();
                        if (length <= i2) {
                            i = !l.startsWith(str3) ? -1 : 0;
                        } else if (!str3.startsWith(l)) {
                            i = -1;
                        }
                        i7++;
                        if (i >= 0) {
                            i6 = i;
                            break;
                        }
                    } else {
                        i2 = 0;
                    }
                    int i9 = i8 - 1;
                    if (i2 == i9) {
                        if (((Long) bnjd.m109587b(bwvh.f161130c)).longValue() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        bmxy.m108589a(z, "PanPrefixSet middleDigitsList should contain 0 as a placeholder.");
                        i3 = 0;
                    } else {
                        if (length < i8) {
                            int i10 = (i8 - length) - 1;
                            String substring = str3.substring(i2);
                            if (!TextUtils.isEmpty(substring)) {
                                j3 = Long.parseLong(substring);
                            }
                            long j4 = j3 + 1;
                            for (int i11 = 0; i11 < i10; i11++) {
                                j3 *= 10;
                                j4 *= 10;
                            }
                            j = j4 - 1;
                        } else {
                            j3 = Long.parseLong(str3.substring(i2, i9));
                            j = j3;
                        }
                        i3 = Collections.binarySearch(bwvh.f161130c, Long.valueOf(j3));
                        if (i3 < 0 && ((-i3) - 1 == bwvh.f161130c.size() || bwvh.f161130c.mo74160a(i3) > j)) {
                            i = -1;
                            i7++;
                            if (i >= 0) {
                            }
                        }
                    }
                    i = length >= i8 ? ((1 << Character.getNumericValue(str3.charAt(i9))) & bwvh.f161131d.mo74151b(i3)) != 0 ? bwvh.f161128a : -1 : 0;
                    i7++;
                    if (i >= 0) {
                    }
                }
                if (z4 || i6 != this.f123097t[i4]) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f123097t[i4] = i6;
            }
            if (!z3 && i6 == 0) {
                this.f123100w = -1;
                z3 = true;
            }
            if (!z3 && i6 > i5) {
                this.f123100w = ((bjpl) this.f123095r.get(i4)).mo65120e();
                i5 = i6;
            }
            i4++;
        }
        if (!z3 && this.f123100w == -1) {
            mo65106a(this.f123098u.f161148e);
        }
        if (z4) {
            long j5 = this.f123100w;
            bjpp bjpp = (bjpp) ((bjhy) this).f122754m;
            if (j5 != bjpp.f123102f) {
                bjpp.f123102f = j5;
                m104230f(j5);
                if (((bjpp) ((bjhy) this).f122754m).mo65438e()) {
                    mo65105a(bwvs.f161172b, 1);
                }
            }
            this.f123096s = null;
            ((bjpp) ((bjhy) this).f122754m).f123103g = this.f123097t;
            ArrayList arrayList = this.f123094q;
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    ((bjpm) arrayList.get(i12)).mo65434d();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo65110a(bwoi bwoi) {
        bxvj bxvj = bwvk.f161135e;
        bwoi.mo74135a(bxvj);
        if (!bwoi.f164952m.mo73911a(bxvj.f164958d)) {
            return super.mo65110a(bwoi);
        }
        bxvj bxvj2 = bwvk.f161135e;
        bwoi.mo74135a(bxvj2);
        Object b = bwoi.f164952m.mo73913b(bxvj2.f164958d);
        if (b == null) {
            b = bxvj2.f164956b;
        } else {
            bxvj2.mo74139a(b);
        }
        bwvk bwvk = (bwvk) b;
        int a = bwvj.m122344a(bwvk.f161139c);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            return ((bjpp) ((bjhy) this).f122754m).f123102f == (bwvk.f161137a == 2 ? ((Long) bwvk.f161138b).longValue() : 0);
        } else if (i == 2) {
            return TextUtils.isEmpty(((bjpp) ((bjhy) this).f122754m).f122753d);
        } else {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            int a2 = bwvj.m122344a(bwvk.f161139c);
            if (a2 == 0) {
                a2 = 1;
            }
            objArr[0] = Integer.valueOf(a2 - 1);
            mo65114b(String.format(locale, "Unknown PanEntryCondition type: %d", objArr));
            return true;
        }
    }
}
