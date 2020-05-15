package p000;

import android.database.SQLException;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ubp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ubp implements ubq {

    /* renamed from: a */
    public static final sbw f47185a = new sbw("HashBasedOpenContentsSt", "");

    /* renamed from: b */
    public final AtomicInteger f47186b = new AtomicInteger(2);

    /* renamed from: c */
    private final SparseArray f47187c = new SparseArray();

    /* renamed from: d */
    private final uaj f47188d;

    /* renamed from: e */
    private final uff f47189e;

    /* renamed from: f */
    private final ufe f47190f;

    public ubp(uaj uaj, uff uff, sqv sqv, ufe ufe) {
        sdo.m34959a(uaj);
        this.f47188d = uaj;
        sdo.m34959a(uff);
        this.f47189e = uff;
        sdo.m34959a(sqv);
        sdo.m34959a(ufe);
        this.f47190f = ufe;
    }

    /* renamed from: a */
    private final synchronized DriveId m38010a(uey uey, ubo ubo, MetadataBundle metadataBundle, DriveId driveId, uaw uaw) {
        int i;
        DriveId driveId2;
        sdo.m34959a(ubo.f47180d);
        try {
            ufa ufa = (ufa) ubo.f47180d.mo27295a(new ufh(uey.f47394a, uey.f47396c, metadataBundle, driveId, this.f47188d, uaw));
            sdo.m34959a(ufa);
            int i2 = ufa.f47399a;
            tyd tyd = (tyd) ufa.f47400b;
            if (i2 == 0) {
                this.f47190f.mo27275a();
                driveId2 = tyd.f46921g;
                mo27166a(ubo);
            } else {
                if (i2 != 3) {
                    i = i2 == 4 ? 1501 : 8;
                } else {
                    i = 1502;
                }
                throw new aaaj(i, "Failed to create the file.");
            }
        } catch (IOException e) {
            throw new aaaj(8, "Failed to commit file because of an I/O error.");
        } catch (Throwable th) {
            mo27166a(ubo);
            throw th;
        }
        return driveId2;
    }

    /* renamed from: b */
    private final synchronized void m38014b(ubo ubo) {
        try {
            ubo.f47183g.linkToDeath(ubo, 0);
            this.f47187c.put(ubo.f47177a, ubo);
            this.f47190f.mo27277a(m38011a());
        } catch (RemoteException e) {
            throw new aaaj(8, "Unable to link client");
        }
    }

    /* renamed from: a */
    private final synchronized Set m38011a() {
        bnia bnia;
        bnia = new bnia();
        int size = this.f47187c.size();
        for (int i = 0; i < size; i++) {
            String str = ((ubo) this.f47187c.valueAt(i)).f47179c;
            if (str != null) {
                bnia.mo67629b(str);
            }
        }
        return bnia.mo67751a();
    }

    /* renamed from: a */
    private final synchronized ubo m38012a(int i) {
        return (ubo) this.f47187c.get(i);
    }

    /* renamed from: a */
    private final synchronized void m38013a(uey uey, ubo ubo, MetadataBundle metadataBundle, ukk ukk, uaw uaw) {
        int i;
        uey uey2 = uey;
        ubo ubo2 = ubo;
        synchronized (this) {
            sdo.m34959a(ubo2.f47180d);
            try {
                ufa ufa = (ufa) ubo2.f47180d.mo27295a(new ufc(uey2.f47394a, uey2.f47396c, ukk, metadataBundle, this.f47188d, ubo2.f47179c, uaw));
                sdo.m34959a(ufa);
                int i2 = ufa.f47399a;
                if (i2 != 0) {
                    if (i2 == 2) {
                        i = 1502;
                    } else {
                        i = 8;
                    }
                    throw new aaaj(i, "Failed to commit changes.");
                }
                this.f47190f.mo27275a();
                mo27166a(ubo2);
            } catch (IOException e) {
                throw new aaaj(8, "Failed to commit file because of an I/O error.");
            } catch (Throwable th) {
                mo27166a(ubo2);
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final long mo27160a(uey uey, int i) {
        mo27165a(uey.f47396c, i);
        ubo a = m38012a(i);
        sdo.m34959a(a.f47180d);
        try {
            return a.f47180d.mo27299e();
        } catch (IOException e) {
            throw new aaaj(8, "Failed to get file size because of an I/O error.");
        }
    }

    /* renamed from: a */
    public final ParcelFileDescriptor mo27161a(ujx ujx) {
        ParcelFileDescriptor parcelFileDescriptor;
        try {
            parcelFileDescriptor = this.f47189e.mo27279a(ujx.mo27633q());
        } catch (SQLException | IOException e) {
            f47185a.mo25378c("HashBasedOpenContentsSt", "Exception occurred while opening file", e);
            parcelFileDescriptor = null;
        }
        if (parcelFileDescriptor != null) {
            return parcelFileDescriptor;
        }
        f47185a.mo25377c("HashBasedOpenContentsSt", "Unable to open file.");
        throw new aaaj(8, "Unable to open file.");
    }

    /* renamed from: a */
    public final Contents mo27162a(uey uey, int i, IBinder iBinder) {
        return mo27163a(uey, (ujx) null, 0, i, iBinder);
    }

    /* renamed from: a */
    public final Contents mo27163a(uey uey, ujx ujx, int i, int i2, IBinder iBinder) {
        DriveId driveId;
        Object obj;
        String str;
        String str2;
        ufm ufm;
        ParcelFileDescriptor parcelFileDescriptor;
        ukk ukk;
        ubo ubo;
        boolean z;
        uey uey2 = uey;
        int i3 = i;
        int i4 = i2;
        if (ujx != null) {
            driveId = ujx.mo27610g();
        } else {
            driveId = null;
        }
        sdo.m34975b(driveId != null ? true : i4 != 268435456, "New files must not be created with MODE_READ_ONLY.");
        sdo.m34975b(i3 == 0 ? true : i4 == 536870912, "baseRequestId must be used with MODE_WRITE_ONLY.");
        sdo.m34975b(i4 == 536870912 ? true : i4 == 268435456 || i4 == 805306368, "Invalid mode");
        Object obj2 = this.f47190f.f47414f;
        synchronized (obj2) {
            if (i3 != 0) {
                try {
                    mo27165a(uey2.f47396c, i3);
                    ubo a = m38012a(i3);
                    if (a.f47180d == null) {
                        str = a.f47179c;
                        mo27166a(a);
                        str2 = null;
                    } else {
                        throw new aaaj(8, "Only READ_ONLY contents may be reopenForWrite().");
                    }
                } catch (Throwable th) {
                    th = th;
                    obj = obj2;
                    throw th;
                }
            } else if (ujx != null) {
                str = ujx.mo27633q();
                str2 = str == null ? null : i4 != 536870912 ? ujx.mo27634r() : null;
            } else {
                str2 = null;
                str = null;
            }
            Pair pair = new Pair(str, str2);
            String str3 = (String) pair.first;
            String str4 = (String) pair.second;
            if (i4 == 268435456) {
                parcelFileDescriptor = this.f47189e.mo27279a(str3);
                ufm = null;
            } else if (i4 == 536870912) {
                ufm = this.f47189e.mo27282a(536870912);
                parcelFileDescriptor = ufm.mo27294a();
            } else if (i4 == 805306368) {
                if (str3 == null) {
                    try {
                        ufm = this.f47189e.mo27282a(805306368);
                    } catch (IOException e) {
                        f47185a.mo25378c("HashBasedOpenContentsSt", String.format("Unable to open file with hash: %s", str3), e);
                        throw new aaaj(8, "Unable to open file.");
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    uff uff = this.f47189e;
                    ParcelFileDescriptor a2 = uff.mo27279a(str3);
                    if (a2 != null) {
                        String uuid = UUID.randomUUID().toString();
                        uff.f47422c.mo27440e(uuid);
                        srz.m36168a(new ParcelFileDescriptor.AutoCloseInputStream(a2), new FileOutputStream(uff.mo27280a(uuid, 0)), true);
                        ufm = new ufm(uff.f47421b, uff.f47422c, uff.f47423d, uff, uuid, 805306368);
                    } else {
                        ufm = null;
                    }
                }
                if (ufm != null) {
                    parcelFileDescriptor = ufm.mo27294a();
                } else {
                    parcelFileDescriptor = null;
                }
            } else {
                throw new aaaj(10, "Unrecognized mode.");
            }
            if (parcelFileDescriptor == null) {
                String valueOf = String.valueOf(str3);
                throw new aaaj(8, valueOf.length() == 0 ? new String("Content is not available locally: ") : "Content is not available locally: ".concat(valueOf));
            }
            Pair pair2 = new Pair(parcelFileDescriptor, ufm);
            if (ujx != null) {
                ukk = ujx.mo27551a();
            } else {
                ukk = null;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) pair2.first;
            ufm ufm2 = (ufm) pair2.second;
            AppIdentity appIdentity = uey2.f47396c;
            ubo ubo2 = ubo;
            obj = obj2;
            ubo = new ubo(this, parcelFileDescriptor2, ufm2, ukk, appIdentity, iBinder, str3);
            m38014b(ubo2);
            if (i4 == 805306368) {
                z = true;
            } else {
                z = i3 != 0;
            }
            Contents contents = new Contents((ParcelFileDescriptor) pair2.first, ubo2.f47177a, i2, driveId, z, str4);
            return contents;
        }
    }

    /* renamed from: a */
    public final synchronized DriveId mo27164a(uey uey, int i, MetadataBundle metadataBundle, DriveId driveId, uaw uaw) {
        ubo a;
        mo27165a(uey.f47396c, i);
        sdo.m34959a(metadataBundle);
        a = m38012a(i);
        if (a.f47181e == null) {
        } else {
            throw new aaaj(10, "Cannot create a new file using contents opened from an existing file.Use DriveResourceClient.createContents() to create the contents instead.");
        }
        return m38010a(uey, a, metadataBundle, driveId, uaw);
    }

    /* renamed from: a */
    public final void mo27165a(AppIdentity appIdentity, int i) {
        ubo a = m38012a(i);
        if (a == null) {
            throw new aaaj(10, "Contents already closed.");
        } else if (!sdg.m34949a(a.f47182f, appIdentity)) {
            throw new aaaj(10, String.format(Locale.US, "App %s cannot verify ownership of this file because it was opened by different app.", appIdentity));
        }
    }

    /* renamed from: a */
    public final synchronized void mo27166a(ubo ubo) {
        ubo.mo27158a();
        this.f47187c.remove(ubo.f47177a);
        this.f47190f.mo27277a(m38011a());
    }

    /* renamed from: a */
    public final void mo27167a(uey uey, int i, MetadataBundle metadataBundle, boolean z, uaw uaw) {
        ukk ukk;
        mo27165a(uey.f47396c, i);
        ubo a = m38012a(i);
        sdo.m34974b(!metadataBundle.mo18275c(uzm.f48737M));
        if (uaw.mo27025a()) {
            if (!z) {
                throw new aaaj(8, "Can't detect conflicts without saveResults");
            } else if (a.f47179c == null) {
                throw new aaaj(8, "Can't detect conflicts without baseContentHash");
            }
        }
        if (z && a.f47180d == null) {
            throw new aaaj(8, "Can't save contents opened for READ_ONLY.");
        } else if (!z || (ukk = a.f47181e) == null) {
            mo27166a(a);
        } else {
            m38013a(uey, a, metadataBundle, ukk, uaw);
        }
    }
}
