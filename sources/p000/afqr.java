package p000;

import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* renamed from: afqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afqr {

    /* renamed from: a */
    public final int f64571a;

    /* renamed from: b */
    private final bmzi f64572b;

    /* renamed from: c */
    private final String f64573c;

    /* renamed from: b */
    public static absl m53459b(Uri uri) {
        absm b = cenl.m137581b();
        if (b != null) {
            absl a = afqn.m53449a(uri, b.f58117a);
            if (a != null) {
                return a;
            }
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Access denied to uri: ");
            sb.append(valueOf);
            throw new afqs(new Status(10, sb.toString()), 5);
        }
        String valueOf2 = String.valueOf(uri);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 31);
        sb2.append("Error in the P/H configuration ");
        sb2.append(valueOf2);
        throw new afqs(new Status(13, sb2.toString()), 10);
    }

    /* renamed from: a */
    public final void mo35000a(absk absk, Uri uri) {
        boolean z;
        abso abso;
        int i = this.f64571a;
        if (i == 0) {
            z = true;
        } else {
            z = i == 1;
        }
        int i2 = absk.f58107a;
        if (i2 != 1 && !z) {
            String valueOf = String.valueOf(this.f64573c);
            throw new afqs(new Status(10, valueOf.length() == 0 ? new String("Expecting a google signed package but got : ") : "Expecting a google signed package but got : ".concat(valueOf)), 11);
        }
        bmzi bmzi = this.f64572b;
        String str = this.f64573c;
        int b = absj.m48219b(i2);
        int i3 = b - 1;
        if (b == 0) {
            throw null;
        } else if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3 && i == 0) {
                        return;
                    }
                } else if (i == 0 || i == 1) {
                    if (absk.f58107a == 3) {
                        abso = (abso) absk.f58108b;
                    } else {
                        abso = abso.f58123b;
                    }
                    bxwc bxwc = abso.f58125a;
                    int size = bxwc.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        absn absn = (absn) bxwc.get(i4);
                        if (TextUtils.equals(absn.f58120a, str)) {
                            absp absp = absn.f58121b;
                            if (absp == null) {
                                absp = absp.f58126b;
                            }
                            if (!absp.f58128a.isEmpty()) {
                                try {
                                    int i5 = ((PackageManager) bmzi.mo6606a()).getPackageInfo(str, 0).versionCode;
                                    absp absp2 = absn.f58121b;
                                    if (absp2 == null) {
                                        absp2 = absp.f58126b;
                                    }
                                    if (!absp2.f58128a.contains(Long.valueOf((long) i5))) {
                                        return;
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                    String valueOf2 = String.valueOf(e.getClass().getName());
                                    throw new afqs(new Status(10, valueOf2.length() == 0 ? new String("Could not retrieve calling package info. Error: ") : "Could not retrieve calling package info. Error: ".concat(valueOf2)), 5);
                                }
                            } else {
                                return;
                            }
                        }
                    }
                }
            } else if (i == 0 || i == 1) {
                return;
            }
            String valueOf3 = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 22);
            sb.append("Access denied to uri: ");
            sb.append(valueOf3);
            throw new afqs(new Status(10, sb.toString()), 5);
        }
    }

    public afqr(bmzi bmzi, String str, int i) {
        this.f64571a = i;
        this.f64572b = bmzi;
        this.f64573c = str;
    }

    /* renamed from: a */
    public final void mo35001a(Uri uri) {
        absl b = m53459b(uri);
        absk absk = b.f58113c;
        if (absk == null) {
            absk = absk.f58105c;
        }
        mo35000a(absk, uri);
        if (uri.getPathSegments().size() != new Uri.Builder().path(b.f58111a).build().getPathSegments().size() + 1) {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Subdirectory system not supported: ");
            sb.append(valueOf);
            throw new afqs(new Status(10, sb.toString()), 5);
        }
    }
}
