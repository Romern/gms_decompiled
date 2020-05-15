package p000;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.util.Log;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: vze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vze {

    /* renamed from: d */
    public static final /* synthetic */ int f50275d = 0;

    /* renamed from: e */
    private static final UUID f50276e = new UUID(-1301668207276963122L, -6645017420763422227L);

    /* renamed from: a */
    public boolean f50277a;

    /* renamed from: b */
    public boolean f50278b;

    /* renamed from: c */
    public final vwf f50279c;

    /* renamed from: f */
    private boolean f50280f;

    public vze(vwf vwf) {
        this.f50279c = vwf;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ce A[Catch:{ all -> 0x00de }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e3  */
    /* renamed from: b */
    private final void m41630b() {
        Throwable th;
        byte[] bArr;
        MediaDrmException e;
        String str;
        Exception e2;
        try {
            MediaDrm mediaDrm = new MediaDrm(f50276e);
            byte[] bArr2 = null;
            try {
                bArr = mediaDrm.openSession();
                try {
                    mediaDrm.getKeyRequest(bArr, "rrrr".getBytes(Charset.forName("UTF-8")), "application/octet-stream", 1, new HashMap());
                    if (bArr != null) {
                        synchronized (vzg.f50281a) {
                            mediaDrm.closeSession(bArr);
                        }
                    }
                    mediaDrm.release();
                } catch (MediaDrmException e3) {
                    e = e3;
                    try {
                        if (e instanceof NotProvisionedException) {
                            try {
                                String propertyString = mediaDrm.getPropertyString("securityLevel");
                                String propertyString2 = mediaDrm.getPropertyString("numberOfOpenSessions");
                                String propertyString3 = mediaDrm.getPropertyString("maxNumberOfSessions");
                                StringBuilder sb = new StringBuilder(String.valueOf(propertyString).length() + 37 + String.valueOf(propertyString2).length() + String.valueOf(propertyString3).length());
                                sb.append("(securityLevel:");
                                sb.append(propertyString);
                                sb.append(",open/max sessions:");
                                sb.append(propertyString2);
                                sb.append("/");
                                sb.append(propertyString3);
                                sb.append(").");
                                str = sb.toString();
                            } catch (Exception e4) {
                                str = "(Failed to get session status).";
                            }
                            String valueOf = String.valueOf(str);
                            throw new vzf(valueOf.length() == 0 ? new String("Unable to check/trigger provisioning right now ") : "Unable to check/trigger provisioning right now ".concat(valueOf), e);
                        }
                        new vzd(this, mediaDrm).start();
                        throw new vzf("Waiting for provisioning response from server.", e);
                    } catch (Throwable th2) {
                        th = th2;
                        bArr2 = bArr;
                        if (bArr2 != null) {
                        }
                        mediaDrm.release();
                        throw th;
                    }
                } catch (Exception e5) {
                    e2 = e5;
                    try {
                        throw new vzf("Exception while opening mediaDrm session.", e2);
                    } catch (Throwable th3) {
                        th = th3;
                        bArr2 = bArr;
                        if (bArr2 != null) {
                        }
                        mediaDrm.release();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    bArr2 = bArr;
                    if (bArr2 != null) {
                        synchronized (vzg.f50281a) {
                            mediaDrm.closeSession(bArr2);
                        }
                    }
                    mediaDrm.release();
                    throw th;
                }
            } catch (MediaDrmException e6) {
                bArr = null;
                e = e6;
                if (e instanceof NotProvisionedException) {
                }
            } catch (Exception e7) {
                bArr = null;
                e2 = e7;
                throw new vzf("Exception while opening mediaDrm session.", e2);
            } catch (Throwable th5) {
                th = th5;
                if (bArr2 != null) {
                }
                mediaDrm.release();
                throw th;
            }
        } catch (Exception e8) {
            int i = Build.VERSION.SDK_INT;
            if (e8 instanceof UnsupportedSchemeException) {
                Log.w("DG.WV", "Widevine DRM not supported on this device", e8);
            } else {
                Log.w("DG.WV", "Unexpected exception while creating MediaDrm.", e8);
            }
        }
    }

    /* renamed from: a */
    public final void mo28993a() {
        try {
            int i = Build.VERSION.SDK_INT;
            if (this.f50280f) {
                Log.w("DG.WV", "Provisioning request denied by server.");
            } else if (!this.f50278b || this.f50277a) {
                m41630b();
            } else {
                Log.i("DG.WV", "Waiting for provisioning response from server.");
            }
        } catch (vzf e) {
            Log.w("DG.WV", "Waiting for device certificate provisioning.", e);
            this.f50279c.mo28911a(e);
        } catch (Exception | LinkageError e2) {
            Log.e("DG.WV", "Unexpected exception.", e2);
            this.f50279c.mo28911a(e2);
        }
    }

    /* renamed from: a */
    public final void mo28994a(byte[] bArr, MediaDrm mediaDrm) {
        try {
            mediaDrm.provideProvisionResponse(bArr);
        } catch (DeniedByServerException e) {
            this.f50280f = true;
            Log.e("DG.WV", "Provisioning denied by remote server", e);
        }
    }
}
