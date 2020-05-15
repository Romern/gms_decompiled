package p000;

import android.location.Location;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collection;

/* renamed from: bfrs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfrs implements bfrc {

    /* renamed from: a */
    final /* synthetic */ bfrt f115071a;

    public bfrs(bfrt bfrt) {
        this.f115071a = bfrt;
    }

    /* renamed from: a */
    public final Location mo62068a(boolean z) {
        bfrt bfrt = this.f115071a;
        return !bfrt.f115075d ? bfrt.f115072a.mo62068a(z) : bfrt.f115076e;
    }

    /* renamed from: a */
    public final void mo62071a(bfrb bfrb) {
        this.f115071a.f115077f = bfrb;
    }

    /* renamed from: b */
    public final void mo62061b() {
        bfrt bfrt = this.f115071a;
        if (bfrt.f115074c) {
            bfrt.f115074c = false;
            if (!bfrt.f115075d) {
                bfrt.f115072a.mo62061b();
            }
        }
    }

    /* renamed from: a */
    public final void mo62058a() {
        bfrt bfrt = this.f115071a;
        if (!bfrt.f115074c) {
            bfrt.f115074c = true;
            if (!bfrt.f115075d) {
                bfrt.f115072a.mo62058a();
            }
        }
    }

    /* renamed from: a */
    public final void mo62069a(Location location, int i) {
        this.f115071a.f115072a.mo62069a(location, i);
    }

    /* renamed from: a */
    public final void mo62070a(bfps bfps) {
        bfrt bfrt = this.f115071a;
        if (!bfrt.f115075d) {
            bfrt.f115072a.mo62070a(bfps);
        } else if (bfps != null) {
            bfps.mo62108a();
        }
    }

    /* renamed from: a */
    public final void mo62072a(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f115071a.f115072a.mo62072a(fileDescriptor, printWriter, strArr);
    }

    /* renamed from: a */
    public final void mo62059a(Collection collection, boolean z) {
        this.f115071a.f115072a.mo62059a(collection, z);
    }
}
