package p000;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafeBrowsingData;
import java.io.File;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: aqcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqcb extends aaab {

    /* renamed from: a */
    final int f85626a;

    /* renamed from: b */
    private long f85627b;

    /* renamed from: c */
    private final apga f85628c;

    /* renamed from: d */
    private final String f85629d;

    /* renamed from: e */
    private final List f85630e;

    /* renamed from: f */
    private final int f85631f;

    /* renamed from: g */
    private final String f85632g;

    /* renamed from: h */
    private final String f85633h;

    static {
        aqcb.class.getSimpleName();
    }

    public aqcb(apga apga, String str) {
        this(apga, null, str, null, 0, null, 2);
    }

    /* renamed from: a */
    private final boolean m71338a() {
        try {
            if (aqbj.f85560d.await(this.f85627b, TimeUnit.MILLISECONDS)) {
                return true;
            }
            m71339b();
            return false;
        } catch (InterruptedException e) {
            m71339b();
            return false;
        }
    }

    /* renamed from: b */
    private final void m71339b() {
        m71340b(Status.f30109c);
    }

    public aqcb(apga apga, String str, String str2, List list, int i, String str3, int i2) {
        super(45, "xlb");
        this.f85628c = apga;
        this.f85629d = str2;
        this.f85630e = list;
        this.f85631f = i;
        this.f85632g = str3;
        this.f85633h = str;
        this.f85626a = i2;
        this.f85627b = 60000;
    }

    /* renamed from: b */
    private final void m71340b(Status status) {
        apga apga = this.f85628c;
        if (apga != null) {
            int i = this.f85626a;
            if (i == 1) {
                this.f85628c.mo47172a(status, new SafeBrowsingData(new JSONObject().toString()));
            } else if (i == 2 || i == 3) {
                apga.mo47167a(status);
            } else if (i == 6) {
                apga.mo47172a(status, new SafeBrowsingData());
            }
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0040 A[Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0049 A[Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }] */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        byte[] bArr;
        aqby aqby;
        aqbx a;
        try {
            int i = this.f85626a;
            if (i == 1) {
                String[] strArr = {this.f85632g};
                String str = this.f85633h;
                List list = this.f85630e;
                int i2 = this.f85631f;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (aqbj.f85557a <= 0) {
                            m71340b(new Status(12009));
                            return;
                        }
                        aqbj.m71299b(context);
                        if (!TextUtils.isEmpty(str)) {
                            m71340b(new Status(12001));
                            return;
                        } else if (list == null || list.isEmpty()) {
                            m71339b();
                            return;
                        } else {
                            String str2 = strArr[0];
                            List a2 = new apgx(str2).mo47199a();
                            if (a2 == null || a2.isEmpty()) {
                                m71339b();
                                return;
                            }
                            aqbj.m71297a(context);
                            if (cgkt.m145937i() && new apgy(context).mo47201a()) {
                                long currentTimeMillis = System.currentTimeMillis();
                                agad agad = (agad) agad.f65053a.get(this.f85629d);
                                if (agad == null) {
                                    String str3 = this.f85629d;
                                    agad.f65053a.put(str3, new agad(str3, str2, currentTimeMillis));
                                } else {
                                    if (currentTimeMillis - agad.f65057e > cgkt.f187180a.mo6606a().mo84002E()) {
                                        agad.f65056d = currentTimeMillis;
                                    }
                                    agad.f65057e = currentTimeMillis;
                                    agad.f65055c = str2;
                                }
                            }
                            JSONObject a3 = aqbj.f85559c.mo47735a(list, a2, str, this.f85629d);
                            if (a3 != null) {
                                this.f85628c.mo47172a(Status.f30107a, new SafeBrowsingData(a3.toString()));
                                return;
                            } else {
                                m71340b(new Status(12000));
                                return;
                            }
                        }
                    }
                }
                if (!aqbj.f85558b) {
                    synchronized (aqbj.class) {
                        aqbj.f85558b = true;
                    }
                }
                aqbj.m71299b(context);
                if (!TextUtils.isEmpty(str)) {
                }
            } else if (i == 2) {
                if (apuh.m71028b(context, this.f85629d)) {
                    aqbj.m71299b(context);
                    if (m71338a()) {
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        aqca aqca = new aqca(countDownLatch);
                        if (this.f85628c != null) {
                            aqbj.f85559c.mo47736a(aqca);
                            try {
                                if (countDownLatch.await(this.f85627b, TimeUnit.MILLISECONDS)) {
                                    this.f85628c.mo47167a(Status.f30107a);
                                } else {
                                    m71339b();
                                }
                            } catch (InterruptedException e) {
                            }
                        } else {
                            aqbj.f85559c.mo47736a((aqbn) null);
                        }
                    }
                } else if (this.f85628c != null) {
                    m71339b();
                }
            } else if (i == 3) {
                aqbj.m71299b(context);
                aqbj.m71300c();
                aqbj.m71297a(context);
                if (m71338a()) {
                    this.f85628c.mo47167a(Status.f30107a);
                }
            } else if (i == 4) {
                aqbj.m71296a();
            } else if (i == 5) {
                int intValue = ((Integer) this.f85630e.get(0)).intValue();
                aqbj.m71299b(context);
                long a4 = new apyk(context).mo47697a(intValue);
                aqbo aqbo = aqbj.f85559c;
                if (aqbo == null || (aqby = aqbo.f85581g) == null || (a = aqby.mo47750a(intValue)) == null) {
                    bArr = null;
                } else {
                    bArr = a.f85619b;
                }
                this.f85628c.mo47172a(Status.f30107a, new SafeBrowsingData(null, null, null, a4, bArr));
            } else if (i != 6) {
            } else {
                if (this.f85631f != 1) {
                    m71340b(new Status(12002));
                } else if (aqbj.f85557a <= 0) {
                    m71340b(new Status(12009));
                } else if (TextUtils.isEmpty(this.f85633h)) {
                    m71340b(new Status(12001));
                } else {
                    byte[] a5 = aqbj.f85559c.mo47737a();
                    if (a5 != null) {
                        SafeBrowsingData safeBrowsingData = new SafeBrowsingData();
                        File file = new File(String.valueOf(context.getApplicationInfo().dataDir).concat("/snet/xlb"));
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        safeBrowsingData.f107331g = file;
                        safeBrowsingData.f107330f = a5;
                        this.f85628c.mo47172a(Status.f30107a, safeBrowsingData);
                        return;
                    }
                    m71339b();
                }
            }
        } catch (RemoteException e2) {
            throw e2;
        } catch (Exception e3) {
            m71339b();
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        if (status != null) {
            m71340b(status);
        } else {
            m71339b();
        }
    }
}
