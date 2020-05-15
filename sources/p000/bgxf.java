package p000;

import com.google.android.ulr.ApiRate;

/* renamed from: bgxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgxf {

    /* renamed from: a */
    final /* synthetic */ bgxg f117888a;

    public bgxf(bgxg bgxg) {
        this.f117888a = bgxg;
    }

    /* renamed from: a */
    private final void m100214a() {
        bgxg bgxg = this.f117888a;
        bgxg.f117896h = !bgxg.mo63315a() ? 5 : 4;
    }

    /* renamed from: b */
    private final void m100215b() {
        bgxg bgxg = this.f117888a;
        bgxg.f117896h = !bgxg.mo63315a() ? 7 : 6;
    }

    /* renamed from: a */
    public final void mo63309a(int i) {
        int i2;
        bgxg bgxg = this.f117888a;
        int i3 = 5;
        int i4 = 3;
        if (chcs.m148225A()) {
            if (i == 3) {
                i2 = 3;
            } else if (i == 4) {
                i2 = 5;
            } else if (i == 5) {
                i2 = 4;
            } else if (i == 6) {
                i2 = 6;
            }
            bgxg.mo63319c(i2);
        }
        int i5 = this.f117888a.f117896h;
        StringBuilder sb = new StringBuilder(66);
        sb.append("Entering StateMachine onEvent, state=");
        sb.append(i5);
        sb.append(", code=");
        sb.append(i);
        sb.toString();
        bgxg bgxg2 = this.f117888a;
        int i6 = bgxg2.f117896h;
        switch (i6) {
            case 2:
            case 8:
            case 9:
                if (i != 1) {
                    if (i != 3) {
                        if (i == 4) {
                            m100215b();
                            break;
                        }
                    } else {
                        m100214a();
                        break;
                    }
                } else {
                    bgxg2.f117896h = 3;
                    break;
                }
                break;
            case 3:
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 7) {
                                bgyf bgyf = bgxg2.f117892d;
                                if (!bgyf.f118017i) {
                                    if (bgyf.f118018j) {
                                        bgxg2.f117896h = 6;
                                        break;
                                    }
                                } else {
                                    bgxg2.f117896h = 4;
                                    break;
                                }
                            }
                        } else {
                            m100215b();
                            break;
                        }
                    } else {
                        m100214a();
                        break;
                    }
                } else {
                    bgxg2.f117896h = 2;
                    break;
                }
                break;
            case 4:
                if (i != 5) {
                    if (i == 8) {
                        if (bgxg2.f117892d.f118014f) {
                            i3 = 3;
                        }
                        bgxg2.f117896h = i3;
                        break;
                    }
                }
                bgxg2.f117896h = 8;
                break;
            case 5:
                if (i != 1) {
                    if (i != 5) {
                        if (i == 7) {
                            bgxg2.f117896h = 4;
                            break;
                        }
                    }
                    bgxg2.f117896h = 8;
                    break;
                }
                bgxg2.f117896h = i4;
                break;
            case 6:
                if (i != 6) {
                    if (i == 8) {
                        if (!bgxg2.f117892d.f118014f) {
                            i4 = 7;
                        }
                        bgxg2.f117896h = i4;
                        break;
                    }
                }
                bgxg2.f117896h = 9;
                break;
            case 7:
                if (i != 1) {
                    if (i != 6) {
                        if (i == 7) {
                            bgxg2.f117896h = 6;
                            break;
                        }
                    }
                    bgxg2.f117896h = 9;
                    break;
                } else {
                    bgxg2.f117896h = 3;
                    break;
                }
            default:
                StringBuilder sb2 = new StringBuilder(38);
                sb2.append("Currently in unknown state ");
                sb2.append(i6);
                bgur.m100025c("GCoreUlr", sb2.toString());
                break;
        }
        int i7 = this.f117888a.f117896h;
        StringBuilder sb3 = new StringBuilder(47);
        sb3.append("Exiting StateMachine onEvent, state=");
        sb3.append(i7);
        sb3.toString();
        bgxg bgxg3 = this.f117888a;
        if (bgto.m99923b()) {
            ApiRate a = bgxg3.mo63310a(0L);
            ApiRate k = bgxg3.f117892d.mo63393k();
            if (k == null || !a.mo71577d().equals(k.mo71577d()) || !a.mo71578e().equals(k.mo71578e())) {
                bgxg3.mo63317b(bgxg3.f117896h);
            }
        }
    }
}
