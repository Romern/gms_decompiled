package p000;

import android.content.Context;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.view.ViewOptions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: xwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class xwh implements xwg {

    /* renamed from: d */
    private static final bnhe f53275d;

    /* renamed from: e */
    private static ModuleManager f53276e;

    /* renamed from: f */
    private static final sek f53277f = new sek(new String[]{"EventLogger"}, (short[]) null);

    /* renamed from: a */
    protected final qws f53278a;

    /* renamed from: b */
    protected final String f53279b;

    /* renamed from: c */
    protected final int f53280c;

    static {
        bnic.m109492a("com.android.chrome", "com.chrome.beta", "com.chrome.dev", "com.chrome.canary");
        bnha h = bnhe.m109414h();
        h.mo67695b(yav.NFC, 1);
        h.mo67695b(yav.NFC_ENABLE, 2);
        h.mo67695b(yav.BLE, 100);
        h.mo67695b(yav.BLE_ENABLE, Integer.valueOf((int) ErrorInfo.TYPE_SDU_FAILED));
        h.mo67695b(yav.BLE_PAIR, 101);
        h.mo67695b(yav.BLE_PROCESS_REQUEST, 102);
        h.mo67695b(yav.BLE_SELECT, Integer.valueOf((int) ErrorInfo.TYPE_SDU_COMMUNICATIONERROR));
        h.mo67695b(yav.MULTI_TRANSPORT, Integer.valueOf((int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR));
        h.mo67695b(yav.USB, Integer.valueOf((int) MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED));
        f53275d = h.mo67618b();
    }

    protected xwh(Context context) {
        bmxv bmxv;
        if (f53276e == null) {
            f53276e = ModuleManager.get(context);
        }
        try {
            Collection allModules = f53276e.getAllModules();
            if (allModules != null && !allModules.isEmpty()) {
                Iterator it = allModules.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ModuleManager.ModuleInfo moduleInfo = (ModuleManager.ModuleInfo) it.next();
                    if (moduleInfo != null && moduleInfo.moduleId.equals("com.google.android.gms.fido")) {
                        bmxv = bmxv.m108566b(Integer.valueOf(moduleInfo.moduleVersion));
                        break;
                    }
                }
                int intValue = ((Integer) bmxv.mo66812a((Object) 0)).intValue();
                this.f53278a = new qws(context, "FIDO", null);
                this.f53279b = "fido";
                this.f53280c = intValue;
            }
            bmxv = bmvz.f131120a;
        } catch (InvalidConfigException e) {
            f53277f.mo25417e("Module version could not be fetched", e, new Object[0]);
            bmxv = bmvz.f131120a;
        }
        int intValue2 = ((Integer) bmxv.mo66812a((Object) 0)).intValue();
        this.f53278a = new qws(context, "FIDO", null);
        this.f53279b = "fido";
        this.f53280c = intValue2;
    }

    /* renamed from: a */
    protected static final List m43502a(Collection collection) {
        if (collection == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(m43503a((Transport) it.next()));
        }
        return arrayList;
    }

    /* renamed from: a */
    protected static final xan m43503a(Transport transport) {
        bmxy.m108581a(transport);
        Transport transport2 = Transport.BLUETOOTH_CLASSIC;
        int ordinal = transport.ordinal();
        if (ordinal == 1) {
            return xan.TRANSPORT_BLE;
        }
        if (ordinal == 2) {
            return xan.TRANSPORT_NFC;
        }
        if (ordinal == 3) {
            return xan.TRANSPORT_USB;
        }
        if (ordinal == 4) {
            return xan.TRANSPORT_INTERNAL;
        }
        String valueOf = String.valueOf(transport);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Unexpected transport: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30187a(xab xab) {
        this.f53278a.mo24335a(xab.mo73642k()).mo24327b();
    }

    /* renamed from: a */
    public final void mo30183a(xwj xwj, ViewOptions viewOptions) {
        bmxy.m108581a(xwj);
        bmxy.m108581a(viewOptions);
        bxvd da = xau.f51823d.mo74144da();
        JSONObject d = viewOptions.mo18856d();
        if (d != null) {
            String jSONObject = d.toString();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            xau xau = (xau) da.f164949b;
            jSONObject.getClass();
            xau.f51825a |= 2;
            xau.f51827c = jSONObject;
        }
        if (!viewOptions.mo18855c().equals(yav.ESK)) {
            Integer num = (Integer) f53275d.get(viewOptions.mo18855c());
            if (num != null) {
                int a = xat.m42575a(num.intValue());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                xau xau2 = (xau) da.f164949b;
                int i = a - 1;
                if (a != 0) {
                    xau2.f51826b = i;
                    xau2.f51825a |= 1;
                } else {
                    throw null;
                }
            }
            bxvd da2 = xab.f51677u.mo74144da();
            int i2 = xwj.f53295a;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            xab xab = (xab) da2.f164949b;
            int i3 = xab.f51679a | 1;
            xab.f51679a = i3;
            xab.f51680b = i2;
            xab.f51681c = 4;
            xab.f51679a = i3 | 2;
            xau xau3 = (xau) da.mo74062i();
            xau3.getClass();
            xab.f51686h = xau3;
            xab.f51679a |= 64;
            mo30187a((xab) da2.mo74062i());
        }
    }

    /* renamed from: a */
    public final void mo30185a(xwj xwj, Throwable th, int i) {
        if (th != null) {
            String a = bdih.m90858a(th);
            bxvd da = xae.f51700d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            xae xae = (xae) da.f164949b;
            a.getClass();
            xae.f51702a |= 1;
            xae.f51703b = a;
            int a2 = xad.m42553a(i);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            xae xae2 = (xae) da.f164949b;
            int i2 = a2 - 1;
            if (a2 != 0) {
                xae2.f51704c = i2;
                xae2.f51702a |= 2;
                xae xae3 = (xae) da.mo74062i();
                bxvd da2 = xab.f51677u.mo74144da();
                if (xwj != null) {
                    int i3 = xwj.f53295a;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    xab xab = (xab) da2.f164949b;
                    xab.f51679a |= 1;
                    xab.f51680b = i3;
                } else {
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    xab xab2 = (xab) da2.f164949b;
                    xab2.f51679a |= 1;
                    xab2.f51680b = 0;
                }
                xab xab3 = (xab) da2.f164949b;
                xab3.f51681c = 100;
                int i4 = xab3.f51679a | 2;
                xab3.f51679a = i4;
                xae3.getClass();
                xab3.f51689k = xae3;
                xab3.f51679a = i4 | 512;
                mo30187a((xab) da2.mo74062i());
                return;
            }
            throw null;
        }
        throw new RuntimeException("logFidoException() called with null parameter");
    }
}
