package p000;

import android.content.Context;
import android.os.RemoteException;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.car.CarInstrumentClusterInfo;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: nma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nma extends nry implements oiy, ojn {

    /* renamed from: a */
    public static final bnsn f36000a = odk.m28481a("CAR.INST");

    /* renamed from: b */
    public final List f36001b = new ArrayList();

    /* renamed from: c */
    public CarInstrumentClusterInfo f36002c = null;

    /* renamed from: d */
    volatile boolean f36003d;

    /* renamed from: e */
    private oiz f36004e;

    /* renamed from: f */
    private oec f36005f;

    /* renamed from: g */
    private final olr f36006g;

    /* renamed from: h */
    private final olt f36007h;

    /* renamed from: i */
    private final oln f36008i;

    /* renamed from: j */
    private final Context f36009j;

    public nma(olr olr, olt olt, oln oln, Context context) {
        this.f36006g = olr;
        this.f36007h = olt;
        this.f36008i = oln;
        this.f36009j = context;
    }

    /* renamed from: c */
    private final nlz m26779c(nsa nsa) {
        List list = this.f36001b;
        int size = list.size();
        int i = 0;
        while (i < size) {
            nlz nlz = (nlz) list.get(i);
            i++;
            if (nlz.f35999b.f12819a == nsa.f12819a) {
                return nlz;
            }
        }
        return null;
    }

    /* renamed from: f */
    private final void m26780f() {
        this.f36008i.mo22279c();
        if (!this.f36003d) {
            throw new IllegalStateException("CarNotConnected");
        } else if (this.f36004e == null) {
            throw new RuntimeException("InstrumentClusterEndpoint not set.");
        }
    }

    /* renamed from: a */
    public final ofs mo20914a(bivb bivb) {
        int i;
        int i2;
        int i3;
        if ((bivb.f121923a & 128) == 0) {
            return null;
        }
        CarInstrumentClusterInfo carInstrumentClusterInfo = new CarInstrumentClusterInfo();
        this.f36002c = carInstrumentClusterInfo;
        bitc bitc = bivb.f121931i;
        if (bitc == null) {
            bitc = bitc.f121624e;
        }
        carInstrumentClusterInfo.f29349a = bitc.f121627b;
        CarInstrumentClusterInfo carInstrumentClusterInfo2 = this.f36002c;
        bitc bitc2 = bivb.f121931i;
        if (bitc2 == null) {
            bitc2 = bitc.f121624e;
        }
        int a = bitb.m102808a(bitc2.f121628c);
        if (a == 0) {
            a = 1;
        }
        carInstrumentClusterInfo2.f29350b = a;
        if (this.f36002c.f29350b == 1) {
            bitc bitc3 = bivb.f121931i;
            if (bitc3 == null) {
                bitc3 = bitc.f121624e;
            }
            if ((bitc3.f121626a & 4) != 0) {
                bitc bitc4 = bivb.f121931i;
                if (bitc4 == null) {
                    bitc4 = bitc.f121624e;
                }
                bisz bisz = bitc4.f121629d;
                if (bisz == null) {
                    bisz = bisz.f121616e;
                }
                int i4 = bisz.f121618a;
                if ((i4 & 1) == 0 || (i4 & 2) == 0 || (i = bisz.f121619b) <= 0 || (i2 = bisz.f121620c) <= 0) {
                    olr olr = this.f36006g;
                    bpdn bpdn = bpdn.PROTOCOL_WRONG_CONFIGURATION;
                    bpdo bpdo = bpdo.NAV_BAD_SIZE;
                    int i5 = bisz.f121619b;
                    int i6 = bisz.f121620c;
                    StringBuilder sb = new StringBuilder(87);
                    sb.append("width and height must both be positive values:  Width = ");
                    sb.append(i5);
                    sb.append("Height = ");
                    sb.append(i6);
                    olr.mo21273a(bpdn, bpdo, sb.toString());
                    return null;
                } else if ((i4 & 4) != 0 && ((i3 = bisz.f121621d) == 8 || i3 == 16 || i3 == 32)) {
                    if (i != i2) {
                        bnsi d = f36000a.mo68390d();
                        d.mo68432a("nma", "a", 126, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        d.mo68411a("CarNavigationStatusService onServiceDiscover called with non-square screen dimensions.  Height and width should be the same but got h=%d and w=%d", bisz.f121619b, bisz.f121620c);
                    }
                    CarInstrumentClusterInfo carInstrumentClusterInfo3 = this.f36002c;
                    int i7 = bisz.f121619b;
                    carInstrumentClusterInfo3.f29352d = i7;
                    int i8 = bisz.f121620c;
                    carInstrumentClusterInfo3.f29351c = i8;
                    int i9 = bisz.f121621d;
                    carInstrumentClusterInfo3.f29353e = i9;
                    if (this.f36005f == null) {
                        this.f36005f = new oec(this.f36009j, i7, i8, i9);
                    }
                } else {
                    olr olr2 = this.f36006g;
                    bpdn bpdn2 = bpdn.PROTOCOL_WRONG_CONFIGURATION;
                    bpdo bpdo2 = bpdo.NAV_BAD_COLOR;
                    int i10 = bisz.f121621d;
                    StringBuilder sb2 = new StringBuilder(73);
                    sb2.append("ColorDepthBits must be 8, 16, or 32.  However the value was = ");
                    sb2.append(i10);
                    olr2.mo21273a(bpdn2, bpdo2, sb2.toString());
                    return null;
                }
            } else {
                this.f36006g.mo21273a(bpdn.PROTOCOL_WRONG_CONFIGURATION, bpdo.NAV_NO_IMAGE_OPTIONS, "No image options set for image capable instrument cluster.");
                return null;
            }
        }
        this.f36003d = true;
        return this;
    }

    /* renamed from: a */
    public final void mo20649a(PrintWriter printWriter) {
    }

    /* renamed from: b */
    public final void mo21095b() {
        synchronized (this.f36001b) {
            for (nlz nlz : this.f36001b) {
                try {
                    nlz.f35999b.mo21504a();
                } catch (RemoteException e) {
                    bnsi c = f36000a.mo68388c();
                    c.mo68432a("nma", "b", (int) ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Error calling onStop()");
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo20658c() {
        throw null;
    }

    /* renamed from: d */
    public final CarInstrumentClusterInfo mo21097d() {
        return this.f36002c;
    }

    /* renamed from: e */
    public final boolean mo21098e() {
        return this.f36002c != null;
    }

    /* renamed from: b */
    public final boolean mo21096b(nsa nsa) {
        nlz c;
        synchronized (this.f36001b) {
            c = m26779c(nsa);
        }
        if (c != null) {
            return mo21093a(c);
        }
        return false;
    }

    /* renamed from: a */
    public final ojh mo20646a(ojm ojm) {
        return new oiz(this, ojm);
    }

    /* renamed from: a */
    public final void mo21087a() {
        synchronized (this.f36001b) {
            for (nlz nlz : this.f36001b) {
                try {
                    nsa nsa = nlz.f35999b;
                    CarInstrumentClusterInfo carInstrumentClusterInfo = this.f36002c;
                    nsa.mo21505a(carInstrumentClusterInfo.f29349a, carInstrumentClusterInfo.f29350b, carInstrumentClusterInfo.f29352d, carInstrumentClusterInfo.f29351c, carInstrumentClusterInfo.f29353e);
                } catch (RemoteException e) {
                    bnsi c = f36000a.mo68388c();
                    c.mo68432a("nma", "a", 188, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Error calling onStart()");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo21088a(int i) {
        m26780f();
        int a = bisx.m102804a(i);
        if (a == 0) {
            bnsi d = f36000a.mo68390d();
            d.mo68432a("nma", "a", (int) BaseMfiEventCallback.TYPE_ISSUE_LIMIT_EXCEEDED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68409a("Using UNAVAILABLE for unknown NavigationStatusEnum value: %d", i);
            a = 1;
        }
        oiz oiz = this.f36004e;
        bxvd da = bisy.f121611c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bisy bisy = (bisy) da.f164949b;
        bisy.f121614b = a - 1;
        bisy.f121613a |= 1;
        int i2 = oiz.f37734a;
        oiz.mo22206a(32771, (bisy) da.mo74062i());
    }

    @Deprecated
    /* renamed from: a */
    public final void mo21089a(int i, int i2) {
        int i3 = oiz.f37734a;
        mo21091a(i, i2, 0, 0);
    }

    @Deprecated
    /* renamed from: a */
    public final void mo21090a(int i, int i2, float f, int i3) {
        m26780f();
        int a = bisp.m102796a(i3);
        if (a == 0) {
            bnsi d = f36000a.mo68390d();
            d.mo68432a("nma", "a", 263, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68409a("Using UNKNOWN_DISTANCE_UNIT for unknown DistanceUnits value: %d", i3);
            a = 1;
        }
        this.f36004e.mo22200a(i, i2, Math.round(f * 1000.0f), a);
    }

    /* renamed from: a */
    public final void mo21091a(int i, int i2, int i3, int i4) {
        m26780f();
        int a = bisp.m102796a(i4);
        if (a == 0) {
            bnsi d = f36000a.mo68390d();
            d.mo68432a("nma", "a", 282, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68409a("Using UNKNOWN_DISTANCE_UNIT for unknown DistanceUnits value: %d", i4);
            a = 1;
        }
        this.f36004e.mo22200a(i, i2, i3, a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b4  */
    /* renamed from: a */
    public final void mo21092a(int i, String str, int i2, int i3, byte[] bArr, int i4) {
        oec oec;
        String str2;
        boolean z;
        m26780f();
        if (!this.f36007h.mo21306ak()) {
            bArr = null;
        }
        if (bArr == null && (oec = this.f36005f) != null) {
            switch (i) {
                case 1:
                    bArr = oec.mo22043a("da_turn_depart");
                    break;
                case 2:
                case 14:
                    bArr = oec.mo22043a("da_turn_straight");
                    break;
                case 3:
                case 4:
                case 5:
                case 7:
                case 8:
                case 9:
                    if (i4 != 1 && i4 != 2) {
                        bArr = oec.mo22042a();
                        break;
                    } else {
                        switch (i) {
                            case 3:
                                str2 = "da_turn_slight_right";
                                if (i4 == 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                bArr = oec.f37339d.mo22041a(str2, z);
                                break;
                            case 4:
                                str2 = "da_turn_right";
                                if (i4 == 1) {
                                }
                                bArr = oec.f37339d.mo22041a(str2, z);
                                break;
                            case 5:
                                str2 = "da_turn_sharp_right";
                                if (i4 == 1) {
                                }
                                bArr = oec.f37339d.mo22041a(str2, z);
                                break;
                            case 6:
                            default:
                                bArr = oec.mo22042a();
                                break;
                            case 7:
                            case 8:
                                str2 = "da_turn_ramp_right";
                                if (i4 == 1) {
                                }
                                bArr = oec.f37339d.mo22041a(str2, z);
                                break;
                            case 9:
                                str2 = "da_turn_fork_right";
                                if (i4 == 1) {
                                }
                                bArr = oec.f37339d.mo22041a(str2, z);
                                break;
                        }
                    }
                case 6:
                case 11:
                case 12:
                case 13:
                    String str3 = "da_turn_generic_roundabout";
                    if (i != 6) {
                        switch (i) {
                            case 12:
                                str3 = "da_turn_roundabout_exit";
                                break;
                            case 13:
                                if (i2 > 0) {
                                    if (i2 > 67) {
                                        if (i2 > 112) {
                                            if (i2 > 157) {
                                                if (i2 > 202) {
                                                    if (i2 > 247) {
                                                        if (i2 > 292) {
                                                            if (i2 > 337) {
                                                                if (i2 <= 360) {
                                                                    str3 = "da_turn_roundabout_8";
                                                                    break;
                                                                }
                                                            } else {
                                                                str3 = "da_turn_roundabout_7";
                                                                break;
                                                            }
                                                        } else {
                                                            str3 = "da_turn_roundabout_6";
                                                            break;
                                                        }
                                                    } else {
                                                        str3 = "da_turn_roundabout_5";
                                                        break;
                                                    }
                                                } else {
                                                    str3 = "da_turn_roundabout_4";
                                                    break;
                                                }
                                            } else {
                                                str3 = "da_turn_roundabout_3";
                                                break;
                                            }
                                        } else {
                                            str3 = "da_turn_roundabout_2";
                                            break;
                                        }
                                    } else {
                                        str3 = "da_turn_roundabout_1";
                                        break;
                                    }
                                }
                                break;
                        }
                    } else {
                        str3 = "da_turn_uturn";
                    }
                    bArr = oec.f37339d.mo22041a(str3, oec.f37337a);
                    break;
                case 10:
                    bArr = oec.mo22043a("da_turn_generic_merge");
                    break;
                case 15:
                case 18:
                default:
                    bArr = oec.mo22042a();
                    break;
                case 16:
                case 17:
                    bArr = oec.mo22043a("da_turn_ferry");
                    break;
                case 19:
                    bArr = oec.mo22043a("da_turn_arrive");
                    break;
            }
        }
        int a = biss.m102799a(i);
        if (a == 0) {
            bnsi d = f36000a.mo68390d();
            d.mo68432a("nma", "a", 234, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68409a("Using UNKNOWN for unknown NextTurnEnum value: %d", i);
            a = 1;
        }
        int a2 = bisu.m102801a(i4);
        if (a2 == 0) {
            bnsi d2 = f36000a.mo68390d();
            d2.mo68432a("nma", "a", 240, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68409a("Using UNSPECIFIED for unknown TurnSide value: %d", i4);
            a2 = 3;
        }
        oiz oiz = this.f36004e;
        bxvd da = bisv.f121600h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bisv bisv = (bisv) da.f164949b;
        "".getClass();
        int i5 = 1 | bisv.f121602a;
        bisv.f121602a = i5;
        bisv.f121603b = "";
        bisv.f121605d = a - 1;
        int i6 = i5 | 4;
        bisv.f121602a = i6;
        if (str != null) {
            str.getClass();
            i6 |= 1;
            bisv.f121602a = i6;
            bisv.f121603b = str;
        }
        int i7 = i6 | 32;
        bisv.f121602a = i7;
        bisv.f121608g = i2;
        int i8 = i7 | 16;
        bisv.f121602a = i8;
        bisv.f121607f = i3;
        bisv.f121604c = a2;
        bisv.f121602a = i8 | 2;
        if (bArr != null) {
            bxtx a3 = bxtx.m123261a(bArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bisv bisv2 = (bisv) da.f164949b;
            a3.getClass();
            bisv2.f121602a |= 8;
            bisv2.f121606e = a3;
        }
        int i9 = oiz.f37734a;
        oiz.mo22206a(32772, da.mo74062i());
    }

    /* renamed from: a */
    public final void mo20651a(ojh ojh) {
        this.f36004e = (oiz) ojh;
    }

    /* renamed from: a */
    public final boolean mo21093a(nlz nlz) {
        synchronized (this.f36001b) {
            for (nlz nlz2 : this.f36001b) {
                if (nlz2 == nlz) {
                    nlz2.f35999b.f12819a.unlinkToDeath(nlz2, 0);
                    boolean remove = this.f36001b.remove(nlz2);
                    return remove;
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo21094a(nsa nsa) {
        m26780f();
        synchronized (this.f36001b) {
            if (m26779c(nsa) == null) {
                nlz nlz = new nlz(this, nsa);
                try {
                    nsa.f12819a.linkToDeath(nlz, 0);
                    try {
                        nsa nsa2 = nlz.f35999b;
                        CarInstrumentClusterInfo carInstrumentClusterInfo = this.f36002c;
                        nsa2.mo21505a(carInstrumentClusterInfo.f29349a, carInstrumentClusterInfo.f29350b, carInstrumentClusterInfo.f29352d, carInstrumentClusterInfo.f29351c, carInstrumentClusterInfo.f29353e);
                        this.f36001b.add(nlz);
                    } catch (RemoteException e) {
                        bnsi b = f36000a.mo68387b();
                        b.mo68432a("nma", "a", 315, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        b.mo68405a("listener.onStart failed.");
                        return false;
                    }
                } catch (RemoteException e2) {
                    bnsi c = f36000a.mo68388c();
                    c.mo68432a("nma", "a", 302, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Adding listener failed.");
                    return false;
                }
            }
        }
        return true;
    }
}
