package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.hardware.usb.UsbManager;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.StateUpdate;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;
import com.google.android.gms.fido.fido2.api.view.BleDeviceIdentifier;
import com.google.android.gms.fido.fido2.api.view.BlePairViewOptions;
import com.google.android.gms.fido.fido2.api.view.MultiTransportViewOptions;
import com.google.android.gms.fido.fido2.api.view.ViewOptions;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xei implements xes {

    /* renamed from: g */
    private static final Logger f52064g = new Logger(new String[]{"Fido2RequestCeremonyStage"}, (short[]) null);

    /* renamed from: a */
    private final Context f52065a;

    /* renamed from: b */
    private final RequestOptions f52066b;

    /* renamed from: c */
    private final xoo f52067c;

    /* renamed from: d */
    private final bnhe f52068d;

    /* renamed from: e */
    private final xhi f52069e;

    /* renamed from: f */
    private final xfz f52070f;

    public xei(Context context, RequestOptions requestOptions, xoo xoo, bnhe bnhe, xhi xhi, xfz xfz) {
        this.f52065a = context;
        this.f52066b = requestOptions;
        this.f52067c = xoo;
        this.f52068d = bnhe;
        this.f52069e = xhi;
        this.f52070f = xfz;
    }

    /* renamed from: a */
    public static final xei m42768a(Context context, xwj xwj, RequestOptions requestOptions, String str, String str2, xoo xoo, bnic bnic) {
        Object obj;
        xhi xhi = new xhi(bnic);
        xhc xhc = new xhc(context, xwj, requestOptions, str, str2, xhi, xoo);
        bnha h = bnhe.m109414h();
        Iterator it = bnic.iterator();
        while (it.hasNext()) {
            Transport transport = (Transport) it.next();
            Transport transport2 = Transport.BLUETOOTH_CLASSIC;
            int ordinal = transport.ordinal();
            if (ordinal == 1) {
                Context context2 = xhc.f52271a;
                obj = new xgi(context2, xhc.f52273c, xhc.f52272b, xhc.f52274d, xhc.f52275e, xhc.f52277g, xhc.f52276f, BluetoothAdapter.getDefaultAdapter(), new xgn(context2), new xih(context2));
            } else if (ordinal == 2) {
                obj = xha.m42910a(xhc.f52271a, xhc.f52273c, xhc.f52272b, xhc.f52277g, xhc.f52274d, xhc.f52275e, xhc.f52276f);
            } else if (ordinal == 3) {
                Context context3 = xhc.f52271a;
                obj = new xhg(context3, xhc.f52273c, xhc.f52272b, xhc.f52277g, xhc.f52274d, xhc.f52275e, xhc.f52276f, (UsbManager) context3.getSystemService("usb"));
            } else if (ordinal == 4) {
                Context context4 = xhc.f52271a;
                obj = new xgv(context4, xhc.f52272b, xhc.f52277g, xhc.f52274d, xhc.f52275e, xhc.f52276f, new xce(context4));
            } else {
                String valueOf = String.valueOf(transport);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("There is no transport controller for");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            h.mo67695b(transport, obj);
        }
        return new xei(context, requestOptions, xoo, h.mo67618b(), xhi, (xfz) xfz.f52155a.mo33309a());
    }

    /* renamed from: b */
    public final bqgg mo29684b() {
        bnia j = bnic.m109500j();
        bnrd a = this.f52068d.values().iterator();
        while (a.hasNext()) {
            xhb xhb = (xhb) a.next();
            try {
                if (xhb.f52270l == 0) {
                    xhb.f52270l = 1;
                    bqgg a2 = xhb.mo29726a();
                    bqga.m112781a(a2, new xex(xez.m42803d(this.f52066b), xhb.mo29733e(), this.f52070f), bqfb.INSTANCE);
                    j.mo67629b(a2);
                    xhb.mo29741g();
                } else {
                    throw adbe.m50106a(8);
                }
            } catch (adbe e) {
                f52064g.mo25417e("Attempted initialize already initialized transport controller", e, new Object[0]);
            }
        }
        String d = xez.m42803d(this.f52066b);
        bngx e2 = xez.m42804e(this.f52066b);
        xfz xfz = (xfz) xfz.f52155a.mo33309a();
        bmxv bmxv = bmvz.f131120a;
        int i = 0;
        while (!bmxv.mo66813a() && i < e2.size()) {
            int i2 = i + 1;
            byte[] bArr = (byte[]) e2.get(i);
            bmxv bmxv2 = bmvz.f131120a;
            if (bArr != null) {
                bmxv2 = xfz.mo29714a(d, bArr);
            }
            i = i2;
            bmxv = !bmxv2.mo66813a() ? xfz.mo29713a() : bmxv2;
        }
        if (!bmxv.mo66813a() && this.f52068d.containsKey(Transport.BLUETOOTH_LOW_ENERGY) && new xgn(this.f52065a).mo29737a()) {
            bmxv = bmxv.m108566b(Transport.BLUETOOTH_LOW_ENERGY);
        }
        if (bmxv.mo66813a()) {
            xhb xhb2 = (xhb) this.f52068d.get(bmxv.mo66814b());
            if (xhb2 != null) {
                xhb2.mo29727a(1);
            }
        } else {
            bmxv a3 = this.f52069e.mo29745a(1, new MultiTransportViewOptions(this.f52068d.keySet()));
            if (a3.mo66813a()) {
                this.f52067c.mo14261a(((ViewOptions) a3.mo66814b()).toString());
            }
        }
        bngx a4 = bngx.m109355a((Iterable) j.mo67751a());
        int size = a4.size();
        if (size == 0) {
            throw new IllegalArgumentException("Expected at least one future, got 0.");
        } else if (size == 1) {
            return new xhs((bqgg) a4.get(0));
        } else {
            xht xht = new xht(a4);
            AtomicReference atomicReference = new AtomicReference(xht);
            AtomicInteger atomicInteger = new AtomicInteger(a4.size());
            bnre i3 = a4.listIterator();
            while (i3.hasNext()) {
                bqgg bqgg = (bqgg) i3.next();
                bqgg.mo741a(new xhr(atomicReference, bqgg, atomicInteger), bqfb.INSTANCE);
            }
            return xht;
        }
    }

    /* renamed from: a */
    public final Integer mo29682a() {
        return 3;
    }

    /* renamed from: a */
    public final void mo29683a(StateUpdate stateUpdate) {
        StateUpdate.Type type = StateUpdate.Type.CANCEL;
        switch (stateUpdate.f31694e.ordinal()) {
            case 0:
            case 3:
                bnrd a = this.f52068d.values().iterator();
                while (a.hasNext()) {
                    xhb xhb = (xhb) a.next();
                    if (xhb.f52270l == 2) {
                        xhb.mo29742h();
                    }
                    int i = xhb.f52270l;
                    if (i == 1 || i == 3) {
                        xhb.f52270l = 4;
                        xhb.mo29732d();
                    }
                }
                this.f52067c.mo14259a(xpv.m43283a(34010));
                return;
            case 1:
                bnrd a2 = this.f52068d.values().iterator();
                while (a2.hasNext()) {
                    ((xhb) a2.next()).mo29742h();
                }
                return;
            case 2:
                bnrd a3 = this.f52068d.values().iterator();
                while (a3.hasNext()) {
                    ((xhb) a3.next()).mo29741g();
                }
                return;
            case 4:
                JSONObject b = stateUpdate.mo18645b();
                try {
                    String string = b.getString("deviceId");
                    boolean z = b.has("requiresPinInstructions") ? b.getBoolean("requiresPinInstructions") : false;
                    xgi xgi = (xgi) this.f52068d.get(Transport.BLUETOOTH_LOW_ENERGY);
                    if (xgi != null && xgi.f52197i.mo29718c().intValue() == 2) {
                        xgg xgg = (xgg) xgi.f52197i;
                        xgg.f52179e = false;
                        BluetoothDevice a4 = xgg.f52178d.mo29821a(string);
                        if (a4 == null) {
                            xgg.f52178d.mo29824b();
                            xgg.mo29722a(2);
                            return;
                        }
                        int bondState = a4.getBondState();
                        if (bondState == 10) {
                            xgg.f52180f = bmxv.m108566b(a4);
                            if (!z) {
                                xgg.f52178d.mo29824b();
                                bmxv a5 = xgg.f52176b.mo29745a(3, new BlePairViewOptions(new BleDeviceIdentifier(a4.getName(), a4.getAddress())));
                                if (a5.mo66813a()) {
                                    xgg.f52175a.mo14261a(((ViewOptions) a5.mo66814b()).toString());
                                }
                                xgg.f52177c.mo29812a(a4, xgg);
                                return;
                            }
                            return;
                        } else if (bondState == 12) {
                            xgg.f52178d.mo29824b();
                            xgg.f52181g = bmxv.m108566b(a4);
                            xgg.mo29725a((Integer) 3);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (JSONException e) {
                    f52064g.mo25416d("Malformed or unrecognized view options %s", b, e);
                    this.f52067c.mo14259a(xpv.m43283a(34009));
                    return;
                }
            case 5:
                JSONObject b2 = stateUpdate.mo18645b();
                try {
                    ViewOptions a6 = ViewOptions.m23543a(b2);
                    Transport b3 = a6.mo18758b();
                    if (b3 != null) {
                        xhb xhb2 = (xhb) this.f52068d.get(b3);
                        if (xhb2 != null) {
                            xhb2.mo29728a(a6);
                            return;
                        }
                        return;
                    } else if (xrv.MULTI_TRANSPORT.equals(a6.mo18759c())) {
                        bmxv a7 = this.f52069e.mo29745a(3, a6);
                        if (a7.mo66813a()) {
                            this.f52067c.mo14261a(((ViewOptions) a7.mo66814b()).toString());
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } catch (JSONException e2) {
                    f52064g.mo25416d("Malformed or unrecognized view options %s", b2, e2);
                    return;
                }
            case 6:
                try {
                    xhb xhb3 = (xhb) this.f52068d.get(Transport.m23428a(stateUpdate.mo18645b().getString("transport")));
                    if (xhb3 != null) {
                        xhb3.mo29727a(3);
                        return;
                    }
                    return;
                } catch (JSONException | xhk e3) {
                    f52064g.mo25415d("Missing or malformed required field \"transport\"", e3, new Object[0]);
                    return;
                }
            case 7:
                JSONObject b4 = stateUpdate.mo18645b();
                try {
                    ViewOptions a8 = ViewOptions.m23543a(b4);
                    bnrd a9 = this.f52068d.values().iterator();
                    while (a9.hasNext()) {
                        ((xhb) a9.next()).mo29734f();
                    }
                    xhi xhi = this.f52069e;
                    xhi.f52297b = 2;
                    xhi.f52296a = a8;
                    return;
                } catch (JSONException e4) {
                    f52064g.mo25416d("Malformed or unrecognized view options %s", b4, e4);
                    return;
                }
            default:
                return;
        }
    }
}
