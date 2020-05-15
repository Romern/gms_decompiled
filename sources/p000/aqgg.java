package p000;

import com.google.android.gms.security.verifier.ApkUploadEntry;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: aqgg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqgg implements Iterator {

    /* renamed from: a */
    final /* synthetic */ aqgi f86043a;

    /* renamed from: b */
    private ApkUploadEntry f86044b = null;

    /* renamed from: c */
    private boolean f86045c = false;

    /* renamed from: d */
    private ApkUploadEntry f86046d = null;

    public aqgg(aqgi aqgi) {
        this.f86043a = aqgi;
    }

    /* renamed from: a */
    private final void m71570a() {
        long j;
        if (!this.f86045c) {
            ApkUploadEntry apkUploadEntry = this.f86044b;
            if (apkUploadEntry != null) {
                j = apkUploadEntry.f107598a;
            } else {
                j = -1;
            }
            this.f86046d = this.f86043a.mo47866a(j);
            this.f86045c = true;
        }
    }

    public final boolean hasNext() {
        m71570a();
        return this.f86046d != null;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        m71570a();
        ApkUploadEntry apkUploadEntry = this.f86046d;
        if (apkUploadEntry != null) {
            this.f86044b = apkUploadEntry;
            this.f86046d = null;
            this.f86045c = false;
            return apkUploadEntry;
        }
        throw new NoSuchElementException();
    }
}
