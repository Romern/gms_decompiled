package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.util.Base64;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.ErrorCode;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.RegisterResponseData;
import com.google.android.gms.fido.u2f.api.common.RequestParams;
import com.google.android.gms.fido.u2f.api.common.ResponseData;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xzp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xzp extends xhp implements xzq {

    /* renamed from: o */
    public static final sek f53470o = new sek(new String[]{"U2fRequestController"}, (short[]) null);

    /* renamed from: m */
    public final Context f53471m;

    /* renamed from: n */
    public final xbc f53472n;

    /* renamed from: p */
    private final xzo f53473p;

    /* renamed from: q */
    private final MessageDigest f53474q;

    public xzp(xzo xzo, yas yas, xxk xxk, xbc xbc, MessageDigest messageDigest, xxj xxj, xyy xyy, xgn xgn, Context context, xwj xwj, xzb xzb, xws xws) {
        xay xay = new xay(context);
        xzh xzh = new xzh(xyy.mo30279a(), xgn, xzb);
        xzz xzz = new xzz(xwj, yas, xws, xyy.mo30279a());
        xyp xyp = new xyp(context, BluetoothAdapter.getDefaultAdapter(), xgn);
        xze xze = new xze(context, xxk);
        xzs xzs = new xzs(context);
        this.f53471m = context;
        this.f52305c = xwj;
        bmxy.m108581a(xzo);
        this.f53473p = xzo;
        bmxy.m108581a(xbc);
        this.f53472n = xbc;
        bmxy.m108581a(xay);
        this.f52307e = xay;
        bmxy.m108581a(messageDigest);
        this.f53474q = messageDigest;
        bmxy.m108581a(xxj);
        this.f52306d = xxj;
        bmxy.m108581a(xyy);
        this.f52313k = xyy;
        bmxy.m108581a(xzh);
        this.f52312j = xzh;
        this.f52314l = xws;
        bmxy.m108581a(xzz);
        this.f52309g = xzz;
        bmxy.m108581a(xzb);
        this.f52308f = xzb;
        this.f52311i = new HashMap();
        Map map = this.f52311i;
        Transport transport = Transport.BLUETOOTH_LOW_ENERGY;
        bmxy.m108581a(xyp);
        map.put(transport, xyp);
        Map map2 = this.f52311i;
        Transport transport2 = Transport.NFC;
        bmxy.m108581a(xze);
        map2.put(transport2, xze);
        Map map3 = this.f52311i;
        Transport transport3 = Transport.USB;
        bmxy.m108581a(xzs);
        map3.put(transport3, xzs);
    }

    /* renamed from: a */
    public final void mo29752a() {
        f53470o.mo25412b("run", new Object[0]);
        RequestParams a = this.f52306d.mo30219a();
        long j = 300000;
        if (!(a == null || a.mo18801b() == null)) {
            j = (long) (a.mo18801b().doubleValue() * 1000.0d);
        }
        this.f52303a.postDelayed(this.f52304b, j);
        bqga.m112781a(xhu.f52320a.mo25819b(new xzj(this)), new xzk(this), xhu.f52320a);
    }

    /* renamed from: b */
    public final void mo29757b() {
        xxi xxi = xxi.INIT;
        int ordinal = this.f52306d.f53334a.ordinal();
        if (ordinal == 0) {
            bqga.m112781a(xhu.f52320a.mo25819b(new xzl(this)), new xzm(this), xhu.f52320a);
        } else if (ordinal != 1) {
            f53470o.mo25416d("In unexpected state to be run(): %s", this.f52306d.f53334a);
        } else {
            mo29755a(this.f52313k.mo30279a());
        }
    }

    /* renamed from: c */
    public final void mo29759c() {
        throw new RuntimeException("Embedded Security Key should not be triggered in U2F flow.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo29760d() {
        mo30061a((Transport) null, new ErrorResponseData(ErrorCode.TIMEOUT));
        this.f52314l.mo30186a(this.f52305c, xag.TYPE_SERVER_SET_TIMEOUT_REACHED);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010e A[Catch:{ IOException -> 0x0117, all -> 0x0115 }] */
    /* renamed from: a */
    public final void mo30061a(Transport transport, ResponseData responseData) {
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream;
        boolean z = false;
        f53470o.mo25414c("onResultReceived(%s, %s)", transport, responseData.toString());
        if (this.f52306d.f53334a != xxi.COMPLETE) {
            if (!(responseData instanceof SignResponseData)) {
                if (!(responseData instanceof RegisterResponseData)) {
                    if (responseData instanceof ErrorResponseData) {
                        ErrorResponseData errorResponseData = (ErrorResponseData) responseData;
                        this.f52306d.mo30220a(errorResponseData);
                        this.f53473p.mo30236a(this.f52305c, errorResponseData, transport);
                    }
                    mo29762f();
                }
            } else if (this.f52306d.mo30224d().f52132d == 2) {
                byte[] k = this.f52306d.mo30224d().mo29694a().mo73780k();
                byte[] bArr = ((SignResponseData) responseData).f31945a;
                xzb xzb = this.f52308f;
                bmxy.m108581a(transport);
                bmxy.m108581a(k);
                bmxy.m108581a(bArr);
                String encodeToString = Base64.encodeToString(k, 11);
                String encodeToString2 = Base64.encodeToString(bArr, 11);
                long currentTimeMillis = System.currentTimeMillis();
                xzi.f53449f.mo25414c("recordKeyHandleSuccess(%s, %s, %s)", transport.f31675g, encodeToString, encodeToString2);
                xzi xzi = (xzi) xzb;
                xzi.f53452d.lock();
                try {
                    String str = transport.f31675g;
                    String a = ((xzi) xzb).f53453e.mo30181a(str);
                    xwf xwf = ((xzi) xzb).f53453e;
                    StringBuilder sb = new StringBuilder(20);
                    sb.append(currentTimeMillis);
                    xwf.mo30182a(str, sb.toString(), a);
                    String a2 = xzi.m43684a(transport, encodeToString);
                    String a3 = ((xzi) xzb).f53453e.mo30181a(a2);
                    if (!encodeToString2.equals(a3)) {
                        ((xzi) xzb).f53453e.mo30182a(a2, encodeToString2, a3);
                    }
                    xwf xwf2 = ((xzi) xzb).f53453e;
                    Lock writeLock = xwf2.f53271a.writeLock();
                    writeLock.lock();
                    BufferedOutputStream bufferedOutputStream2 = null;
                    try {
                        if (xwf2.f53274d) {
                            fileOutputStream = new FileOutputStream(xwf2.f53272b);
                            try {
                                bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                            } catch (Throwable th) {
                                th = th;
                                if (bufferedOutputStream2 != null) {
                                }
                                writeLock.unlock();
                                throw th;
                            }
                            try {
                                xwf2.f53273c.store(bufferedOutputStream, (String) null);
                                xwf2.f53274d = false;
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedOutputStream2 = bufferedOutputStream;
                                if (bufferedOutputStream2 != null) {
                                }
                                writeLock.unlock();
                                throw th;
                            }
                            try {
                                bufferedOutputStream.close();
                            } catch (IOException e) {
                                throw e;
                            } catch (Throwable th3) {
                                th = th3;
                                writeLock.unlock();
                                throw th;
                            }
                        }
                        writeLock.unlock();
                    } catch (Throwable th4) {
                        th = th4;
                        fileOutputStream = null;
                        if (bufferedOutputStream2 != null) {
                            bufferedOutputStream2.close();
                        } else if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e2) {
                                throw e2;
                            } catch (Throwable th5) {
                                th = th5;
                                writeLock.unlock();
                                throw th;
                            }
                        }
                        writeLock.unlock();
                        throw th;
                    }
                } catch (IOException e3) {
                    xwg xwg = ((xzi) xzb).f53451c;
                    if (xwg != null) {
                        xwg.mo30184a(((xzi) xzb).f53450b, e3);
                    }
                    xzi.f53449f.mo25417e("recordKeyHandleSuccess failed", e3, new Object[0]);
                } finally {
                    xzi.f53452d.unlock();
                }
            }
            xzo xzo = this.f53473p;
            xwj xwj = this.f52305c;
            xxj xxj = this.f52306d;
            if (xxj.f53334a == xxi.REQUEST_PREPARED) {
                z = true;
            }
            bmxy.m108600b(z);
            xxj.f53335b = responseData;
            xxj.mo30226f();
            xzo.mo30236a(xwj, xxj.f53335b, transport);
            mo29762f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo30288a(String str) {
        f53470o.mo25412b("onSecurityKeySignRequestAppIdsValidated", new Object[0]);
        if (str == null) {
            sek sek = f53470o;
            String valueOf = String.valueOf(this.f53472n);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb.append("App ID not allowed for caller ");
            sb.append(valueOf);
            sek.mo25416d(sb.toString(), new Object[0]);
            mo30061a((Transport) null, new ErrorResponseData(ErrorCode.BAD_REQUEST));
            return;
        }
        this.f52306d.mo30221a(this.f53474q, str, null, null);
        Set a = this.f52313k.mo30279a();
        mo29755a(a);
        mo29758b(a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29756a(JSONObject jSONObject) {
        boolean z;
        try {
            String string = jSONObject.getString("deviceId");
            if (jSONObject.has("requiresPinInstructions")) {
                z = jSONObject.getBoolean("requiresPinInstructions");
            } else {
                z = false;
            }
            Map map = this.f52310h;
            if (map != null) {
                xyr xyr = (xyr) map.get(Transport.BLUETOOTH_LOW_ENERGY);
                if (xyr != null) {
                    xyr.mo30273a(string, z);
                } else {
                    f53470o.mo25414c("Empty BleRequestController.", new Object[0]);
                }
            } else {
                f53470o.mo25416d("No transport controllers initialized", new Object[0]);
            }
        } catch (JSONException e) {
            f53470o.mo25417e("Missing or malformed required field \"deviceId\"", e, new Object[0]);
            this.f52314l.mo30184a(this.f52305c, e);
            mo30061a((Transport) null, new ErrorResponseData(ErrorCode.OTHER_ERROR));
        }
    }
}
