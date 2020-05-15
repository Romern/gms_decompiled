package p000;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

/* renamed from: ueg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ueg implements ufx {

    /* renamed from: a */
    final /* synthetic */ ueh f47343a;

    public ueg(ueh ueh) {
        this.f47343a = ueh;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0104  */
    /* renamed from: a */
    public final void mo27242a(int i) {
        Status status;
        if (ufy.m38299a(i) && this.f47343a.mo27238f()) {
            this.f47343a.mo27249a(i);
            boolean z = false;
            switch (i) {
                case 2:
                case 3:
                case 4:
                case 6:
                    vcy vcy = this.f47343a.f47239c;
                    if (i == 3) {
                        z = true;
                    }
                    vcy.mo28291a(z);
                    ueh ueh = this.f47343a;
                    if (!ueh.f47349l) {
                        try {
                            ujx b = ueh.f47237a.mo27088b(ueh.f47346i.f30922a);
                            long s = b.mo27635s();
                            ParcelFileDescriptor parcelFileDescriptor = null;
                            try {
                                parcelFileDescriptor = ueh.f47345h.mo27161a(b);
                                try {
                                    ueh.mo27253a(parcelFileDescriptor, b.mo27634r());
                                    if (!ueh.f47349l) {
                                        srz.m36170a(parcelFileDescriptor);
                                    }
                                    status = (ueh.f47349l && ueh.mo27254a(1, s, s)) ? Status.f30107a : new Status(8, "Failed to create session or communicate with client");
                                } catch (aaaj e) {
                                    e = e;
                                    try {
                                        ueh.f47344g.mo25378c("StreamContentsOperation", "Failed to start session", e);
                                        status = new Status(8, "Failed to start session");
                                        if (!ueh.f47349l) {
                                        }
                                        if (status.mo17710c()) {
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        if (!ueh.f47349l) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (!ueh.f47349l) {
                                    }
                                    throw th;
                                }
                            } catch (aaaj e2) {
                                e = e2;
                                ueh.f47344g.mo25378c("StreamContentsOperation", "Failed to start session", e);
                                status = new Status(8, "Failed to start session");
                                if (!ueh.f47349l) {
                                    srz.m36170a(parcelFileDescriptor);
                                }
                                if (status.mo17710c()) {
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (!ueh.f47349l) {
                                    srz.m36170a(parcelFileDescriptor);
                                }
                                throw th;
                            }
                        } catch (aaaj e3) {
                            ueh.f47344g.mo25378c("StreamContentsOperation", "Failed to retrieve entry", e3);
                            status = new Status(8, "Failed to retrieve entry");
                        }
                    } else if (i != 2) {
                        status = new Status(7, "Error downloading file");
                    } else {
                        try {
                            long e4 = ueh.f47347j.mo27307b().mo27299e();
                            status = !ueh.mo27254a(1, e4, e4) ? new Status(8, "Failed to notify the client with completion") : Status.f30107a;
                        } catch (IOException e5) {
                            ueh.f47344g.mo25378c("StreamContentsOperation", "Could not access file", e5);
                            status = new Status(8, "Could not access file");
                        }
                    }
                    if (status.mo17710c()) {
                        vcy vcy2 = this.f47343a.f47239c;
                        vcy2.mo28307h();
                        vcy2.mo28274a();
                        return;
                    }
                    this.f47343a.mo27255b(status);
                    return;
                case 5:
                case 7:
                case 8:
                    this.f47343a.mo27255b(new Status(ufy.m38302d(i), "Error downloading file"));
                    return;
                default:
                    ueh.f47344g.mo25374b("StreamContentsOperation", "Invalid state here: %s", Integer.valueOf(i));
                    return;
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        if (r2.f47349l != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0062, code lost:
        if (r2.f47349l == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0064, code lost:
        p000.srz.m36170a(r3);
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006d  */
    /* renamed from: a */
    public final void mo27243a(long j, long j2) {
        ufm b;
        String str;
        boolean z;
        this.f47343a.f47348k = j2;
        ueh ueh = this.f47343a;
        if (ueh.f47347j != null && !ueh.mo27241i()) {
            if (!ueh.f47349l && (b = ueh.f47347j.mo27307b()) != null) {
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    ugb ugb = ueh.f47347j.f47489a;
                    if (ugb != null) {
                        if (ugb.f47500f != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        sdo.m34971a(z, (Object) "Download hasn't been started yet");
                        str = ugb.f47501g;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        ueh.f47344g.mo25377c("StreamContentsOperation", "Signature is null for a non-null pending content");
                    }
                    parcelFileDescriptor = ParcelFileDescriptor.open(b.mo27298d(), 268435456);
                    try {
                        ueh.mo27253a(parcelFileDescriptor, str);
                    } catch (aaaj | IOException e) {
                        e = e;
                        try {
                            ueh.f47344g.mo25378c("StreamContentsOperation", "Exception while starting a session", e);
                        } catch (Throwable th) {
                            th = th;
                            if (!ueh.f47349l) {
                                srz.m36170a(parcelFileDescriptor);
                            }
                            throw th;
                        }
                    }
                } catch (aaaj | IOException e2) {
                    e = e2;
                    ueh.f47344g.mo25378c("StreamContentsOperation", "Exception while starting a session", e);
                } catch (Throwable th2) {
                    th = th2;
                    if (!ueh.f47349l) {
                    }
                    throw th;
                }
            }
            if (ueh.f47349l) {
                ueh.mo27254a(0, j, j2);
            }
        }
    }
}
