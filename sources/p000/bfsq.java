package p000;

import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: bfsq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfsq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ FileDescriptor f115156a;

    /* renamed from: b */
    final /* synthetic */ PrintWriter f115157b;

    /* renamed from: c */
    final /* synthetic */ String[] f115158c;

    /* renamed from: d */
    final /* synthetic */ bfsr f115159d;

    public bfsq(bfsr bfsr, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f115159d = bfsr;
        this.f115156a = fileDescriptor;
        this.f115157b = printWriter;
        this.f115158c = strArr;
    }

    public final void run() {
        this.f115159d.f114732e.mo62072a(this.f115156a, this.f115157b, this.f115158c);
    }
}
