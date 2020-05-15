package p000;

import android.content.Context;
import android.os.RemoteException;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.postsetup.ConnectionHint;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;
import com.google.android.gms.smartdevice.postsetup.PostSetupAuthData;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: arsi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arsi {

    /* renamed from: a */
    static final byte[] f88226a = "smartdevice.postsetup.key".getBytes(Charset.forName("UTF-8"));

    /* renamed from: c */
    private static final sek f88227c = ascp.m73787a("PostSetup", "PostSetupManager");

    /* renamed from: b */
    byse f88228b;

    /* renamed from: d */
    private final arac f88229d;

    /* renamed from: e */
    private final int f88230e;

    /* renamed from: f */
    private final armd f88231f;

    public arsi(Context context, int i, armd armd) {
        this.f88229d = arqd.m73299d(context);
        this.f88230e = i;
        this.f88231f = armd;
        if (i == 100) {
            armd.mo48634a(7);
        } else {
            armd.mo48634a(6);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: arsi.a(com.google.android.gms.common.api.Status, boolean):void
     arg types: [com.google.android.gms.common.api.Status, int]
     candidates:
      arsi.a(byte[], byte[]):byte[]
      arsi.a(artk, com.google.android.gms.smartdevice.postsetup.HandshakeData):void
      arsi.a(com.google.android.gms.common.api.Status, boolean):void */
    /* renamed from: a */
    private final void m73375a(artk artk, Status status, ConnectionHint connectionHint) {
        try {
            mo48799a(status, false);
            artk.mo48812a(status, connectionHint);
        } catch (RemoteException e) {
            f88227c.mo25410a((Throwable) e);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: arsi.a(com.google.android.gms.common.api.Status, boolean):void
     arg types: [com.google.android.gms.common.api.Status, int]
     candidates:
      arsi.a(byte[], byte[]):byte[]
      arsi.a(artk, com.google.android.gms.smartdevice.postsetup.HandshakeData):void
      arsi.a(com.google.android.gms.common.api.Status, boolean):void */
    /* renamed from: b */
    private final void m73379b(artk artk, Status status, HandshakeData handshakeData) {
        try {
            mo48799a(status, false);
            artk.mo48813a(status, handshakeData);
        } catch (RemoteException e) {
            f88227c.mo25410a((Throwable) e);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: arsi.a(com.google.android.gms.common.api.Status, boolean):void
     arg types: [com.google.android.gms.common.api.Status, int]
     candidates:
      arsi.a(byte[], byte[]):byte[]
      arsi.a(artk, com.google.android.gms.smartdevice.postsetup.HandshakeData):void
      arsi.a(com.google.android.gms.common.api.Status, boolean):void */
    /* renamed from: c */
    private final void m73380c(artk artk, Status status, HandshakeData handshakeData) {
        try {
            mo48799a(status, false);
            artk.mo48816c(status, handshakeData);
        } catch (RemoteException e) {
            f88227c.mo25410a((Throwable) e);
        }
    }

    /* renamed from: d */
    public final void mo48805d(artk artk, HandshakeData handshakeData) {
        byse byse;
        if (handshakeData == null || handshakeData.f108101b == null || handshakeData.f108102c == null) {
            f88227c.mo25416d("Handshake data is invalid for authenticate().", new Object[0]);
            m73377a(artk, new Status(13), new PostSetupAuthData());
        } else if (this.f88230e == 100 && (byse = this.f88228b) != null && byse.mo74497d() == 3) {
            byte[] a = this.f88229d.mo48327a();
            if (a != null) {
                try {
                    mo48800a(handshakeData, m73378a(a, handshakeData.f108101b), a, artk, 100);
                } catch (IOException | IllegalArgumentException e) {
                    f88227c.mo25417e("Error happened when generateCode. ", e, new Object[0]);
                    m73377a(artk, new Status(13), new PostSetupAuthData());
                }
            } else {
                f88227c.mo25416d("No shared secret stored on target device.", new Object[0]);
                m73377a(artk, new Status(10590), new PostSetupAuthData());
            }
        } else {
            m73377a(artk, new Status(10593), new PostSetupAuthData());
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: arsi.a(com.google.android.gms.common.api.Status, boolean):void
     arg types: [com.google.android.gms.common.api.Status, int]
     candidates:
      arsi.a(byte[], byte[]):byte[]
      arsi.a(artk, com.google.android.gms.smartdevice.postsetup.HandshakeData):void
      arsi.a(com.google.android.gms.common.api.Status, boolean):void */
    /* renamed from: a */
    private final void m73376a(artk artk, Status status, HandshakeData handshakeData) {
        try {
            mo48799a(status, false);
            artk.mo48815b(status, handshakeData);
        } catch (RemoteException e) {
            f88227c.mo25410a((Throwable) e);
        }
    }

    /* renamed from: b */
    public final void mo48802b(artk artk) {
        try {
            this.f88228b = byse.m125241a(bysc.P256_SHA512);
            if (!mo48801a(100)) {
                m73376a(artk, new Status(10593), new HandshakeData());
                return;
            }
            m73376a(artk, Status.f30107a, new HandshakeData(this.f88228b.mo74493a()));
        } catch (byrq e) {
            m73376a(artk, new Status(10592), new HandshakeData());
        }
    }

    /* renamed from: c */
    public final void mo48804c(artk artk, HandshakeData handshakeData) {
        if (handshakeData == null || handshakeData.f108101b == null || handshakeData.f108102c == null) {
            f88227c.mo25416d("Handshake data is invalid for authenticate().", new Object[0]);
            m73377a(artk, new Status(13), new PostSetupAuthData());
        }
        if (!mo48801a((int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR)) {
            m73377a(artk, new Status(10593), new PostSetupAuthData());
            return;
        }
        byte[] a = this.f88229d.mo48327a();
        if (a == null) {
            f88227c.mo25416d("No shared secret stored on target device.", new Object[0]);
            m73377a(artk, new Status(10590), new PostSetupAuthData());
            return;
        }
        try {
            this.f88228b.mo74492a(handshakeData.f108101b);
            try {
                try {
                    mo48800a(handshakeData, m73378a(a, this.f88228b.mo74494a(32)), a, artk, BaseMfiEventCallback.TYPE_UNKNOWN_ERROR);
                } catch (IOException | IllegalArgumentException e) {
                    f88227c.mo25417e("Error happened when generateCode. ", e, new Object[0]);
                    m73377a(artk, new Status(13), new PostSetupAuthData());
                }
            } catch (byrq e2) {
                m73377a(artk, new Status(10592), new PostSetupAuthData());
            }
        } catch (byrq | bysb e3) {
            f88227c.mo25410a(e3);
            m73377a(artk, new Status(10592), new PostSetupAuthData());
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: arsi.a(com.google.android.gms.common.api.Status, boolean):void
     arg types: [com.google.android.gms.common.api.Status, int]
     candidates:
      arsi.a(byte[], byte[]):byte[]
      arsi.a(artk, com.google.android.gms.smartdevice.postsetup.HandshakeData):void
      arsi.a(com.google.android.gms.common.api.Status, boolean):void */
    /* renamed from: a */
    private final void m73377a(artk artk, Status status, PostSetupAuthData postSetupAuthData) {
        try {
            mo48799a(status, true);
            artk.mo48814a(status, postSetupAuthData);
        } catch (RemoteException e) {
            f88227c.mo25410a((Throwable) e);
        }
    }

    /* renamed from: a */
    public static byte[] m73378a(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null) {
            Mac c = spn.m35871c("HmacSHA256");
            if (c != null) {
                try {
                    c.init(new SecretKeySpec(bArr, "HmacSHA256"));
                    return c.doFinal(bArr2);
                } catch (InvalidKeyException e) {
                    f88227c.mo25410a((Throwable) e);
                    throw new IOException("Invalid key.", e);
                }
            } else {
                throw new IOException("Failed to get Mac.");
            }
        } else {
            throw new IllegalArgumentException("Missing argument, message.");
        }
    }

    /* renamed from: b */
    public final void mo48803b(artk artk, HandshakeData handshakeData) {
        if (handshakeData == null || handshakeData.f108101b == null) {
            f88227c.mo25416d("Handshake data couldn't be null for targetFinish().", new Object[0]);
            m73380c(artk, new Status(13), new HandshakeData());
        } else if (!mo48801a(100)) {
            m73380c(artk, new Status(10593), new HandshakeData());
        } else {
            byte[] a = this.f88229d.mo48327a();
            if (a != null) {
                try {
                    this.f88228b.mo74492a(handshakeData.f108101b);
                    try {
                        try {
                            m73380c(artk, Status.f30107a, new HandshakeData(this.f88228b.mo74493a(), m73378a(a, this.f88228b.mo74494a(32))));
                        } catch (IOException | IllegalArgumentException e) {
                            f88227c.mo25417e("Error getting HMAC.", e, new Object[0]);
                            m73380c(artk, new Status(13), new HandshakeData());
                        }
                    } catch (byrq e2) {
                        m73380c(artk, new Status(10592), new HandshakeData());
                    }
                } catch (byrq | bysb | IllegalStateException e3) {
                    f88227c.mo25410a(e3);
                    m73380c(artk, new Status(10592), new HandshakeData());
                }
            } else {
                f88227c.mo25416d("No shared secret stored on target device.", new Object[0]);
                m73380c(artk, new Status(10590), new HandshakeData());
            }
        }
    }

    /* renamed from: a */
    public final void mo48797a(artk artk) {
        long j = ((arqc) this.f88229d).f88112a.getLong("session", 0);
        ConnectionHint connectionHint = new ConnectionHint();
        if (j != 0) {
            connectionHint.f108098b = Long.toString(j);
            connectionHint.f108097a.add(2);
            this.f88231f.mo48635a(j);
            m73375a(artk, Status.f30107a, connectionHint);
            return;
        }
        m73375a(artk, new Status(10590), connectionHint);
    }

    /* renamed from: a */
    public final void mo48798a(artk artk, HandshakeData handshakeData) {
        if (handshakeData == null || handshakeData.f108101b == null) {
            f88227c.mo25416d("Handshake data couldn't be null for sourceInit().", new Object[0]);
            m73379b(artk, new Status(13), new HandshakeData());
        }
        try {
            this.f88228b = byse.m125248b(bysc.P256_SHA512);
            if (!mo48801a((int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR)) {
                m73379b(artk, new Status(10593), new HandshakeData());
                return;
            }
            this.f88228b.mo74492a(handshakeData.f108101b);
            m73379b(artk, Status.f30107a, new HandshakeData(this.f88228b.mo74493a()));
        } catch (byrq | bysb | IllegalStateException e) {
            f88227c.mo25410a(e);
            m73379b(artk, new Status(10592), new HandshakeData());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo48799a(Status status, boolean z) {
        boolean c = status.mo17710c();
        if (!c || z) {
            this.f88231f.f87884a.mo48674a(c);
            if (!status.mo17710c()) {
                armd armd = this.f88231f;
                int i = status.f30115i;
                armd.f87884a.mo48674a(false);
                armd.f87884a.mo48673a(i);
            }
            this.f88231f.mo48633a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo48800a(HandshakeData handshakeData, byte[] bArr, byte[] bArr2, artk artk, int i) {
        if (MessageDigest.isEqual(handshakeData.f108102c, bArr)) {
            this.f88228b.mo74495b();
            try {
                byte[] a = this.f88228b.mo74496c().mo74475a();
                PostSetupAuthData postSetupAuthData = new PostSetupAuthData(byst.m125284a(new SecretKeySpec(a, "HmacSHA256"), bArr2, f88226a));
                if (i == 200) {
                    byte[] bArr3 = new byte[32];
                    new SecureRandom().nextBytes(bArr3);
                    postSetupAuthData.f108107c = new HandshakeData(bArr3, m73378a(bArr2, bArr3));
                    postSetupAuthData.f108105a.add(3);
                }
                m73377a(artk, Status.f30107a, postSetupAuthData);
            } catch (Exception e) {
                throw new IOException(e);
            } catch (byrq | IOException | NoSuchAlgorithmException e2) {
                f88227c.mo25415d("Error getting a symmetric key from ukey2Handshake. ", e2, new Object[0]);
                m73377a(artk, new Status(10592), new PostSetupAuthData());
            }
            f88227c.mo25412b("Post authentication succeed. ", new Object[0]);
            return;
        }
        m73377a(artk, new Status(10591), new PostSetupAuthData());
        f88227c.mo25416d("HMAC on two devices don't match. ", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo48801a(int i) {
        if (this.f88230e != i) {
            f88227c.mo25416d("Device is not in the right Role.", new Object[0]);
            return false;
        }
        byse byse = this.f88228b;
        if (byse != null && byse.mo74497d() == 1) {
            return true;
        }
        f88227c.mo25416d("Handshake is not started yet", new Object[0]);
        return false;
    }
}
