package p000;

import android.util.Pair;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: zsr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zsr {

    /* renamed from: a */
    public final bxvd f55829a;

    /* renamed from: b */
    private final C1223np f55830b = new C1223np();

    public zsr(long j) {
        bxvd da = bpgw.f137569C.mo74144da();
        this.f55829a = da;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpgw bpgw = (bpgw) da.f164949b;
        bpgw.f137573a |= 1;
        bpgw.f137574b = j;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.util.Collection, bmxj]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* renamed from: a */
    public final bpgw mo31451a() {
        bxvd bxvd = this.f55829a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpgw bpgw = bpgw.f137569C;
        ((bpgw) bxvd.f164949b).f137581i = bxvk.m124030de();
        bxvd bxvd2 = this.f55829a;
        bnic a = bnic.m109488a(bnjd.m109575a((Iterable) this.f55830b.values(), zsq.f55828a));
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bpgw bpgw2 = (bpgw) bxvd2.f164949b;
        if (!bpgw2.f137581i.mo73666a()) {
            bpgw2.f137581i = bxvk.m124021a(bpgw2.f137581i);
        }
        bxsy.m123078a(a, bpgw2.f137581i);
        return (bpgw) this.f55829a.mo74062i();
    }

    /* renamed from: b */
    public final void mo31458b() {
        bxvd bxvd = this.f55829a;
        int i = ((bpgw) bxvd.f164949b).f137578f + 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpgw bpgw = (bpgw) bxvd.f164949b;
        bpgw bpgw2 = bpgw.f137569C;
        bpgw.f137573a |= 16;
        bpgw.f137578f = i;
    }

    /* renamed from: c */
    public final void mo31461c() {
        bxvd bxvd = this.f55829a;
        int i = ((bpgw) bxvd.f164949b).f137579g + 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpgw bpgw = (bpgw) bxvd.f164949b;
        bpgw bpgw2 = bpgw.f137569C;
        bpgw.f137573a |= 32;
        bpgw.f137579g = i;
    }

    /* renamed from: d */
    public final void mo31464d() {
        bxvd bxvd = this.f55829a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpgw bpgw = (bpgw) bxvd.f164949b;
        bpgw bpgw2 = bpgw.f137569C;
        bpgw.f137572B = 1;
        bpgw.f137573a |= 134217728;
    }

    /* renamed from: d */
    public final void mo31465d(int i) {
        bxvd bxvd = this.f55829a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpgw bpgw = (bpgw) bxvd.f164949b;
        bpgw bpgw2 = bpgw.f137569C;
        bpgw.f137595w = i - 1;
        bpgw.f137573a |= 4194304;
    }

    /* renamed from: b */
    public final void mo31459b(int i) {
        bxvd bxvd = this.f55829a;
        int i2 = ((bpgw) bxvd.f164949b).f137584l + i;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpgw bpgw = (bpgw) bxvd.f164949b;
        bpgw bpgw2 = bpgw.f137569C;
        bpgw.f137573a |= 512;
        bpgw.f137584l = i2;
    }

    /* renamed from: c */
    public final void mo31462c(int i) {
        bxvd bxvd = this.f55829a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpgw bpgw = (bpgw) bxvd.f164949b;
        bpgw bpgw2 = bpgw.f137569C;
        bpgw.f137598z = i - 1;
        bpgw.f137573a |= 33554432;
    }

    /* renamed from: d */
    public final void mo31466d(long j) {
        bxvd bxvd = this.f55829a;
        int i = (int) j;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpgw bpgw = (bpgw) bxvd.f164949b;
        bpgw bpgw2 = bpgw.f137569C;
        bpgw.f137573a |= 2097152;
        bpgw.f137594v = i;
    }

    /* renamed from: c */
    public final void mo31463c(long j) {
        bxvd bxvd = this.f55829a;
        int i = (int) j;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpgw bpgw = (bpgw) bxvd.f164949b;
        bpgw bpgw2 = bpgw.f137569C;
        bpgw.f137573a |= 2;
        bpgw.f137575c = i;
    }

    /* renamed from: b */
    public final void mo31460b(long j) {
        bxvd bxvd = this.f55829a;
        int i = (int) j;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpgw bpgw = (bpgw) bxvd.f164949b;
        bpgw bpgw2 = bpgw.f137569C;
        bpgw.f137573a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        bpgw.f137590r = i;
    }

    /* renamed from: a */
    public final void mo31452a(int i) {
        bxvd bxvd = this.f55829a;
        int i2 = ((bpgw) bxvd.f164949b).f137583k + i;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpgw bpgw = (bpgw) bxvd.f164949b;
        bpgw bpgw2 = bpgw.f137569C;
        bpgw.f137573a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        bpgw.f137583k = i2;
    }

    /* renamed from: a */
    public final void mo31453a(int i, int i2, long j) {
        bxvd bxvd = this.f55829a;
        int i3 = ((bpgw) bxvd.f164949b).f137585m + i;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpgw bpgw = (bpgw) bxvd.f164949b;
        bpgw bpgw2 = bpgw.f137569C;
        bpgw.f137573a |= 1024;
        bpgw.f137585m = i3;
        bxvd bxvd2 = this.f55829a;
        int i4 = ((bpgw) bxvd2.f164949b).f137586n + i2;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bpgw bpgw3 = (bpgw) bxvd2.f164949b;
        bpgw3.f137573a |= 4096;
        bpgw3.f137586n = i4;
        bxvd bxvd3 = this.f55829a;
        int i5 = ((bpgw) bxvd3.f164949b).f137593u + ((int) j);
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        bpgw bpgw4 = (bpgw) bxvd3.f164949b;
        bpgw4.f137573a |= 1048576;
        bpgw4.f137593u = i5;
    }

    /* renamed from: a */
    public final void mo31454a(long j) {
        bxvd bxvd = this.f55829a;
        int i = (int) j;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpgw bpgw = (bpgw) bxvd.f164949b;
        bpgw bpgw2 = bpgw.f137569C;
        bpgw.f137573a |= 67108864;
        bpgw.f137571A = i;
    }

    /* renamed from: a */
    public final void mo31455a(cadt cadt) {
        cadu cadu = cadu.UNKNOWN_SYNC_SOURCE;
        cadt cadt2 = cadt.UNKNOWN_CONNECTIVITY;
        int ordinal = cadt.ordinal();
        if (ordinal == 0) {
            bxvd bxvd = this.f55829a;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpgw bpgw = (bpgw) bxvd.f164949b;
            bpgw bpgw2 = bpgw.f137569C;
            bpgw.f137577e = 0;
            bpgw.f137573a |= 8;
        } else if (ordinal == 1) {
            bxvd bxvd2 = this.f55829a;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bpgw bpgw3 = (bpgw) bxvd2.f164949b;
            bpgw bpgw4 = bpgw.f137569C;
            bpgw3.f137577e = 1;
            bpgw3.f137573a |= 8;
        } else if (ordinal == 2) {
            bxvd bxvd3 = this.f55829a;
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            bpgw bpgw5 = (bpgw) bxvd3.f164949b;
            bpgw bpgw6 = bpgw.f137569C;
            bpgw5.f137577e = 2;
            bpgw5.f137573a |= 8;
        } else if (ordinal == 3) {
            bxvd bxvd4 = this.f55829a;
            if (bxvd4.f164950c) {
                bxvd4.mo74035c();
                bxvd4.f164950c = false;
            }
            bpgw bpgw7 = (bpgw) bxvd4.f164949b;
            bpgw bpgw8 = bpgw.f137569C;
            bpgw7.f137577e = 3;
            bpgw7.f137573a |= 8;
        }
    }

    /* renamed from: a */
    public final void mo31456a(cadu cadu) {
        cadu cadu2 = cadu.UNKNOWN_SYNC_SOURCE;
        cadt cadt = cadt.UNKNOWN_CONNECTIVITY;
        switch (cadu.ordinal()) {
            case 0:
                bxvd bxvd = this.f55829a;
                bpgy bpgy = bpgy.UNKNOWN_SYNC_SOURCE;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bpgw bpgw = (bpgw) bxvd.f164949b;
                bpgw bpgw2 = bpgw.f137569C;
                bpgw.f137576d = bpgy.f137611k;
                bpgw.f137573a |= 4;
                return;
            case 1:
                bxvd bxvd2 = this.f55829a;
                bpgy bpgy2 = bpgy.PERIODIC;
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                bpgw bpgw3 = (bpgw) bxvd2.f164949b;
                bpgw bpgw4 = bpgw.f137569C;
                bpgw3.f137576d = bpgy2.f137611k;
                bpgw3.f137573a |= 4;
                return;
            case 2:
                bxvd bxvd3 = this.f55829a;
                bpgy bpgy3 = bpgy.PEER_CONNECTED;
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                bpgw bpgw5 = (bpgw) bxvd3.f164949b;
                bpgw bpgw6 = bpgw.f137569C;
                bpgw5.f137576d = bpgy3.f137611k;
                bpgw5.f137573a |= 4;
                return;
            case 3:
                bxvd bxvd4 = this.f55829a;
                bpgy bpgy4 = bpgy.SESSION_INSERTED;
                if (bxvd4.f164950c) {
                    bxvd4.mo74035c();
                    bxvd4.f164950c = false;
                }
                bpgw bpgw7 = (bpgw) bxvd4.f164949b;
                bpgw bpgw8 = bpgw.f137569C;
                bpgw7.f137576d = bpgy4.f137611k;
                bpgw7.f137573a |= 4;
                return;
            case 4:
                bxvd bxvd5 = this.f55829a;
                bpgy bpgy5 = bpgy.FIT_APP_INITIATED;
                if (bxvd5.f164950c) {
                    bxvd5.mo74035c();
                    bxvd5.f164950c = false;
                }
                bpgw bpgw9 = (bpgw) bxvd5.f164949b;
                bpgw bpgw10 = bpgw.f137569C;
                bpgw9.f137576d = bpgy5.f137611k;
                bpgw9.f137573a |= 4;
                return;
            case 5:
                bxvd bxvd6 = this.f55829a;
                bpgy bpgy6 = bpgy.GOAL_UPDATED;
                if (bxvd6.f164950c) {
                    bxvd6.mo74035c();
                    bxvd6.f164950c = false;
                }
                bpgw bpgw11 = (bpgw) bxvd6.f164949b;
                bpgw bpgw12 = bpgw.f137569C;
                bpgw11.f137576d = bpgy6.f137611k;
                bpgw11.f137573a |= 4;
                return;
            case 6:
                bxvd bxvd7 = this.f55829a;
                bpgy bpgy7 = bpgy.SIGNIFICANT_STEPS;
                if (bxvd7.f164950c) {
                    bxvd7.mo74035c();
                    bxvd7.f164950c = false;
                }
                bpgw bpgw13 = (bpgw) bxvd7.f164949b;
                bpgw bpgw14 = bpgw.f137569C;
                bpgw13.f137576d = bpgy7.f137611k;
                bpgw13.f137573a |= 4;
                return;
            case 7:
                bxvd bxvd8 = this.f55829a;
                bpgy bpgy8 = bpgy.HEIGHT_UPDATED;
                if (bxvd8.f164950c) {
                    bxvd8.mo74035c();
                    bxvd8.f164950c = false;
                }
                bpgw bpgw15 = (bpgw) bxvd8.f164949b;
                bpgw bpgw16 = bpgw.f137569C;
                bpgw15.f137576d = bpgy8.f137611k;
                bpgw15.f137573a |= 4;
                return;
            case 8:
                bxvd bxvd9 = this.f55829a;
                bpgy bpgy9 = bpgy.WEIGHT_UPDATED;
                if (bxvd9.f164950c) {
                    bxvd9.mo74035c();
                    bxvd9.f164950c = false;
                }
                bpgw bpgw17 = (bpgw) bxvd9.f164949b;
                bpgw bpgw18 = bpgw.f137569C;
                bpgw17.f137576d = bpgy9.f137611k;
                bpgw17.f137573a |= 4;
                return;
            case 9:
                bxvd bxvd10 = this.f55829a;
                bpgy bpgy10 = bpgy.SERVER_INITIATED;
                if (bxvd10.f164950c) {
                    bxvd10.mo74035c();
                    bxvd10.f164950c = false;
                }
                bpgw bpgw19 = (bpgw) bxvd10.f164949b;
                bpgw bpgw20 = bpgw.f137569C;
                bpgw19.f137576d = bpgy10.f137611k;
                bpgw19.f137573a |= 4;
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004d, code lost:
        if (r8 != 3) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0097  */
    /* renamed from: a */
    public final void mo31457a(String str, boolean z, int i, int i2) {
        bzzv a = bzzk.m126356a(str);
        Pair create = Pair.create(str, Boolean.valueOf(z));
        C1223np npVar = this.f55830b;
        bxvd da = bpft.f137436g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpft bpft = (bpft) da.f164949b;
        bpft.f137439b = a.f172235aH;
        int i3 = bpft.f137438a | 1;
        bpft.f137438a = i3;
        bpft.f137438a = i3 | 2;
        bpft.f137440c = z;
        bxvd bxvd = (bxvd) npVar.getOrDefault(create, da);
        this.f55830b.putIfAbsent(create, bxvd);
        int i4 = i - 1;
        cadu cadu = cadu.UNKNOWN_SYNC_SOURCE;
        cadt cadt = cadt.UNKNOWN_CONNECTIVITY;
        if (i == 0) {
            throw null;
        } else if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = ((bpft) bxvd.f164949b).f137441d + 1;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bpft bpft2 = (bpft) bxvd.f164949b;
                    bpft2.f137438a |= 4;
                    bpft2.f137441d = i5;
                }
                int i6 = ((bpft) bxvd.f164949b).f137443f + i2;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bpft bpft3 = (bpft) bxvd.f164949b;
                bpft3.f137438a |= 16;
                bpft3.f137443f = i6;
            }
            int i7 = ((bpft) bxvd.f164949b).f137442e + 1;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpft bpft4 = (bpft) bxvd.f164949b;
            bpft4.f137438a |= 8;
            bpft4.f137442e = i7;
            int i62 = ((bpft) bxvd.f164949b).f137443f + i2;
            if (bxvd.f164950c) {
            }
            bpft bpft32 = (bpft) bxvd.f164949b;
            bpft32.f137438a |= 16;
            bpft32.f137443f = i62;
        }
    }
}
