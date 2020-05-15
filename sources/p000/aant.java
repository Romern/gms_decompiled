package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: aant */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aant implements aanv {

    /* renamed from: a */
    private final aanu f28652a;

    /* renamed from: b */
    private final bxvd f28653b;

    public aant(aait aait) {
        aaix aaix;
        int a;
        int a2;
        aaiy aaiy = aait.f28230j;
        aaiy = aaiy == null ? aaiy.f28242c : aaiy;
        if (aaiy.f28244a == 1) {
            aaix = (aaix) aaiy.f28245b;
        } else {
            aaix = aaix.f28235f;
        }
        this.f28653b = aaix.f28235f.mo74141a(aaix);
        this.f28652a = new aanu();
        aaix aaix2 = (aaix) this.f28653b.f164949b;
        int i = aaix2.f28240d;
        aanu aanu = this.f28652a;
        if (i >= aanu.f28660g && i <= aanu.f28661h && (a = aaiw.m21320a(aaix2.f28241e)) != 0 && a != 1) {
            aaix aaix3 = (aaix) this.f28653b.f164949b;
            int i2 = aaix3.f28238b;
            int a3 = aaiw.m21320a(aaix3.f28241e);
            if (i2 < m21700c(a3 == 0 ? 1 : a3)) {
                aaix aaix4 = (aaix) this.f28653b.f164949b;
                if (aaix4.f28239c < this.f28652a.f28659f && ((a2 = aaiw.m21320a(aaix4.f28241e)) == 0 || a2 != 2 || ((aaix) this.f28653b.f164949b).f28239c == 0)) {
                    bxvd bxvd = this.f28653b;
                    int b = m21699b(((aaix) bxvd.f164949b).f28240d);
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    aaix aaix5 = (aaix) bxvd.f164949b;
                    aaix5.f28237a |= 4;
                    aaix5.f28240d = b;
                    return;
                }
            }
        }
        bxvd bxvd2 = this.f28653b;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        aaix aaix6 = (aaix) bxvd2.f164949b;
        aaix6.f28237a |= 1;
        aaix6.f28238b = 0;
        bxvd bxvd3 = this.f28653b;
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        aaix aaix7 = (aaix) bxvd3.f164949b;
        aaix7.f28237a |= 2;
        aaix7.f28239c = 0;
        bxvd bxvd4 = this.f28653b;
        int b2 = m21699b(this.f28652a.f28663j);
        if (bxvd4.f164950c) {
            bxvd4.mo74035c();
            bxvd4.f164950c = false;
        }
        aaix aaix8 = (aaix) bxvd4.f164949b;
        aaix8.f28237a |= 4;
        aaix8.f28240d = b2;
        bxvd bxvd5 = this.f28653b;
        if (bxvd5.f164950c) {
            bxvd5.mo74035c();
            bxvd5.f164950c = false;
        }
        aaix aaix9 = (aaix) bxvd5.f164949b;
        aaix9.f28241e = 4;
        aaix9.f28237a |= 8;
    }

    /* renamed from: a */
    private final void m21698a(String str) {
        aaix aaix = (aaix) this.f28653b.f164949b;
        int i = aaix.f28238b;
        int i2 = aaix.f28239c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
        sb.append(str);
        sb.append(", good=");
        sb.append(i);
        sb.append(" bad=");
        sb.append(i2);
        sb.toString();
    }

    /* renamed from: b */
    private final int m21699b(int i) {
        aanu aanu = this.f28652a;
        int a = bqcn.m112577a(i, aanu.f28660g, aanu.f28661h);
        aanu aanu2 = this.f28652a;
        double d = (double) (a - aanu2.f28660g);
        double d2 = (double) aanu2.f28662i;
        Double.isNaN(d);
        Double.isNaN(d2);
        long round = Math.round(d / d2);
        aanu aanu3 = this.f28652a;
        return aanu3.f28660g + (((int) round) * aanu3.f28662i);
    }

    /* renamed from: c */
    private final int m21700c(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return this.f28652a.f28655b;
        }
        if (i2 == 1) {
            return this.f28652a.f28655b;
        }
        if (i2 != 2) {
            return i2 != 3 ? this.f28652a.f28654a : this.f28652a.f28657d;
        }
        return this.f28652a.f28656c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r0 == 5) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01e1  */
    /* renamed from: d */
    private final synchronized void m21702d() {
        bxvd bxvd;
        int a = aaiw.m21320a(((aaix) this.f28653b.f164949b).f28241e);
        if (a != 0) {
            if (a == 2) {
                int i = ((aaix) this.f28653b.f164949b).f28240d;
                aanu aanu = this.f28652a;
                int i2 = aanu.f28660g;
                if (i > i2) {
                    int a2 = bqcn.m112580a(i - aanu.f28662i, i2);
                    bxvd bxvd2 = this.f28653b;
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    aaix aaix = (aaix) bxvd2.f164949b;
                    aaix aaix2 = aaix.f28235f;
                    aaix.f28237a = 4 | aaix.f28237a;
                    aaix.f28240d = a2;
                    int i3 = ((aaix) this.f28653b.f164949b).f28240d;
                    StringBuilder sb = new StringBuilder(50);
                    sb.append("Lowering heartbeat interval 1 notch to ");
                    sb.append(i3);
                    m21698a(sb.toString());
                } else {
                    m21698a("Resetting heartbeat counters (at min)");
                }
                bxvd bxvd3 = this.f28653b;
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                aaix aaix3 = (aaix) bxvd3.f164949b;
                aaix aaix4 = aaix.f28235f;
                aaix3.f28241e = 2;
                aaix3.f28237a |= 8;
                bxvd = this.f28653b;
                if (!bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                aaix aaix5 = (aaix) bxvd.f164949b;
                aaix5.f28237a |= 1;
                aaix5.f28238b = 0;
            }
        }
        int a3 = aaiw.m21320a(((aaix) this.f28653b.f164949b).f28241e);
        if (a3 == 0) {
        }
        aaix aaix6 = (aaix) this.f28653b.f164949b;
        int i4 = aaix6.f28239c;
        aanu aanu2 = this.f28652a;
        if (i4 + 1 < aanu2.f28659f) {
            int i5 = aaix6.f28240d;
            if (i5 > aanu2.f28660g) {
                double d = aanu2.f28658e;
                double d2 = (double) i5;
                Double.isNaN(d2);
                int b = m21699b((int) (d2 * d));
                if (b >= ((aaix) this.f28653b.f164949b).f28240d) {
                    b -= this.f28652a.f28662i;
                }
                int a4 = bqcn.m112580a(b, this.f28652a.f28660g);
                bxvd bxvd4 = this.f28653b;
                int i6 = ((aaix) bxvd4.f164949b).f28240d;
                if (bxvd4.f164950c) {
                    bxvd4.mo74035c();
                    bxvd4.f164950c = false;
                }
                aaix aaix7 = (aaix) bxvd4.f164949b;
                aaix aaix8 = aaix.f28235f;
                aaix7.f28237a = 4 | aaix7.f28237a;
                aaix7.f28240d = a4;
                int i7 = ((aaix) this.f28653b.f164949b).f28240d;
                StringBuilder sb2 = new StringBuilder(96);
                sb2.append("Lowering heartbeat interval from ");
                sb2.append(i6);
                sb2.append(" to ");
                sb2.append(i7);
                sb2.append(" using ratio ");
                sb2.append(d);
                m21698a(sb2.toString());
            } else {
                m21698a("Resetting heartbeat counters (at min)");
            }
            bxvd bxvd5 = this.f28653b;
            int i8 = ((aaix) bxvd5.f164949b).f28239c + 1;
            if (bxvd5.f164950c) {
                bxvd5.mo74035c();
                bxvd5.f164950c = false;
            }
            aaix aaix9 = (aaix) bxvd5.f164949b;
            aaix aaix10 = aaix.f28235f;
            aaix9.f28237a = 2 | aaix9.f28237a;
            aaix9.f28239c = i8;
            bxvd bxvd6 = this.f28653b;
            if (bxvd6.f164950c) {
                bxvd6.mo74035c();
                bxvd6.f164950c = false;
            }
            aaix aaix11 = (aaix) bxvd6.f164949b;
            aaix11.f28241e = 3;
            aaix11.f28237a |= 8;
        } else {
            int i9 = aaix6.f28240d;
            if (i9 > aanu2.f28660g) {
                StringBuilder sb3 = new StringBuilder(51);
                sb3.append("Dropping heartbeat interval to min from ");
                sb3.append(i9);
                m21698a(sb3.toString());
                bxvd bxvd7 = this.f28653b;
                int i10 = this.f28652a.f28660g;
                if (bxvd7.f164950c) {
                    bxvd7.mo74035c();
                    bxvd7.f164950c = false;
                }
                aaix aaix12 = (aaix) bxvd7.f164949b;
                aaix aaix13 = aaix.f28235f;
                aaix12.f28237a |= 4;
                aaix12.f28240d = i10;
            } else {
                m21698a("Resetting heartbeat counters (at min)");
            }
            bxvd bxvd8 = this.f28653b;
            if (bxvd8.f164950c) {
                bxvd8.mo74035c();
                bxvd8.f164950c = false;
            }
            aaix aaix14 = (aaix) bxvd8.f164949b;
            aaix aaix15 = aaix.f28235f;
            aaix14.f28237a = 2 | aaix14.f28237a;
            aaix14.f28239c = 0;
            bxvd bxvd9 = this.f28653b;
            if (bxvd9.f164950c) {
                bxvd9.mo74035c();
                bxvd9.f164950c = false;
            }
            aaix aaix16 = (aaix) bxvd9.f164949b;
            aaix16.f28241e = 4;
            aaix16.f28237a |= 8;
        }
        bxvd = this.f28653b;
        if (!bxvd.f164950c) {
        }
        aaix aaix52 = (aaix) bxvd.f164949b;
        aaix52.f28237a |= 1;
        aaix52.f28238b = 0;
    }

    public final String toString() {
        aanu aanu = this.f28652a;
        int i = aanu.f28655b;
        int i2 = aanu.f28656c;
        int i3 = aanu.f28657d;
        int i4 = aanu.f28659f;
        double d = aanu.f28658e;
        int i5 = aanu.f28660g;
        int i6 = aanu.f28661h;
        int i7 = aanu.f28662i;
        int i8 = aanu.f28663j;
        aaix aaix = (aaix) this.f28653b.f164949b;
        int i9 = aaix.f28238b;
        int i10 = aaix.f28239c;
        int i11 = aaix.f28240d;
        int a = aaiw.m21320a(aaix.f28241e);
        if (a == 0) {
            a = 1;
        }
        String valueOf = String.valueOf(Integer.toString(a - 1));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 424);
        sb.append("FastSlowHeartbeatAlgorithm{fast_upward_trigger: ");
        sb.append(i);
        sb.append(", slow_upward_trigger: ");
        sb.append(i2);
        sb.append(", after_ratio_drop_upward_trigger: ");
        sb.append(i3);
        sb.append(", fall_fast_trigger: ");
        sb.append(i4);
        sb.append(", drop_ratio: ");
        sb.append(d);
        sb.append(", interval_range: [");
        sb.append(i5);
        sb.append(", ");
        sb.append(i6);
        sb.append("], interval_step: ");
        sb.append(i7);
        sb.append(", initial_interval: ");
        sb.append(i8);
        sb.append(", good_heartbeat_count: ");
        sb.append(i9);
        sb.append(", bad_heartbeat_count: ");
        sb.append(i10);
        sb.append(", heartbeat_interval: ");
        sb.append(i11);
        sb.append(", phase: ");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: c */
    private final synchronized void m21701c() {
        bxvd bxvd = this.f28653b;
        int i = ((aaix) bxvd.f164949b).f28238b + 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        aaix aaix = (aaix) bxvd.f164949b;
        aaix aaix2 = aaix.f28235f;
        aaix.f28237a |= 1;
        aaix.f28238b = i;
        int a = aaiw.m21320a(((aaix) this.f28653b.f164949b).f28241e);
        if (a == 0) {
            a = 1;
        }
        int c = m21700c(a);
        aaix aaix3 = (aaix) this.f28653b.f164949b;
        if (aaix3.f28238b >= c) {
            int i2 = aaix3.f28240d;
            aanu aanu = this.f28652a;
            int i3 = aanu.f28661h;
            if (i2 < i3) {
                int[] iArr = {i2 + aanu.f28662i, i3};
                bmxy.m108588a(true);
                int i4 = iArr[0];
                for (char c2 = 1; c2 < 2; c2 = 2) {
                    int i5 = iArr[1];
                    if (i5 < i4) {
                        i4 = i5;
                    }
                }
                bxvd bxvd2 = this.f28653b;
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                aaix aaix4 = (aaix) bxvd2.f164949b;
                aaix4.f28237a |= 4;
                aaix4.f28240d = i4;
                int i6 = ((aaix) this.f28653b.f164949b).f28240d;
                StringBuilder sb = new StringBuilder(41);
                sb.append("Raising heartbeat interval to ");
                sb.append(i6);
                m21698a(sb.toString());
            } else {
                m21698a("Resetting heartbeat counters (at max)");
            }
            bxvd bxvd3 = this.f28653b;
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            aaix aaix5 = (aaix) bxvd3.f164949b;
            aaix5.f28237a |= 1;
            aaix5.f28238b = 0;
            bxvd bxvd4 = this.f28653b;
            if (bxvd4.f164950c) {
                bxvd4.mo74035c();
                bxvd4.f164950c = false;
            }
            aaix aaix6 = (aaix) bxvd4.f164949b;
            aaix6.f28237a |= 2;
            aaix6.f28239c = 0;
            bxvd bxvd5 = this.f28653b;
            if (bxvd5.f164950c) {
                bxvd5.mo74035c();
                bxvd5.f164950c = false;
            }
            aaix aaix7 = (aaix) bxvd5.f164949b;
            aaix7.f28241e = 1;
            aaix7.f28237a |= 8;
        }
    }

    /* renamed from: b */
    public final aait mo17154b() {
        bxvd da = aaiy.f28242c.mo74144da();
        bxvd bxvd = this.f28653b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aaiy aaiy = (aaiy) da.f164949b;
        aaix aaix = (aaix) bxvd.mo74062i();
        aaix.getClass();
        aaiy.f28245b = aaix;
        aaiy.f28244a = 1;
        aaiy aaiy2 = (aaiy) da.mo74062i();
        bxvd da2 = aait.f28219k.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        aait aait = (aait) da2.f164949b;
        aaiy2.getClass();
        aait.f28230j = aaiy2;
        aait.f28221a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        return (aait) da2.mo74062i();
    }

    /* renamed from: a */
    public final int mo17152a() {
        return ((aaix) this.f28653b.f164949b).f28240d;
    }

    /* renamed from: a */
    public final void mo17153a(int i) {
        if (i != 1) {
            m21702d();
        } else {
            m21701c();
        }
    }
}
