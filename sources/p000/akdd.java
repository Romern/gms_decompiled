package p000;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: akdd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akdd {

    /* renamed from: a */
    public static final byte[] f71639a = new byte[0];

    /* renamed from: b */
    public final akdw f71640b;

    /* renamed from: c */
    public final String f71641c;

    /* renamed from: d */
    public final ConcurrentLinkedQueue f71642d = new ConcurrentLinkedQueue();

    /* renamed from: e */
    public boolean f71643e = false;

    /* renamed from: f */
    private akdc f71644f;

    public akdd(akdw akdw, String str) {
        this.f71640b = akdw;
        this.f71641c = str;
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akdd", "<init>", 56, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("A new NearbyConnection for %s has been created", str);
    }

    /* renamed from: a */
    public final void mo39250a(akdc akdc) {
        synchronized (this.f71640b) {
            this.f71644f = akdc;
            if (this.f71643e && akdc != null) {
                akdc.mo39249a();
            }
        }
    }

    /* renamed from: b */
    public final void mo39253b() {
        synchronized (this.f71640b) {
            if (!this.f71643e) {
                this.f71640b.mo39295b(this.f71641c);
                this.f71642d.add(f71639a);
                akdc akdc = this.f71644f;
                if (akdc != null) {
                    akdc.mo39249a();
                }
                this.f71643e = true;
                bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
                bnsl.mo68432a("akdd", "b", 133, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Closed NearbyConnection for %s", this.f71641c);
            }
            this.f71640b.notifyAll();
        }
    }

    /* renamed from: c */
    public final boolean mo39255c() {
        boolean z;
        synchronized (this.f71640b) {
            z = this.f71643e;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo39251a(byte[] bArr) {
        synchronized (this.f71640b) {
            if (!this.f71643e) {
                this.f71640b.mo39296b(this.f71641c, ahiq.m55840a(bArr), akdb.f71638a);
            } else {
                throw new IOException("Connection closed");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo39254b(byte[] bArr) {
        synchronized (this.f71640b) {
            if (!this.f71643e) {
                bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
                bnsl.mo68432a("akdd", "b", 87, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Wrote NearbyConnection message to queue for %s", this.f71641c);
                this.f71642d.add(bArr);
                this.f71640b.notify();
                return;
            }
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl2.mo68432a("akdd", "b", 82, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Dropping NearbyConnection message for %s because we're closed", this.f71641c);
        }
    }

    /* renamed from: a */
    public final byte[] mo39252a() {
        byte[] bArr;
        synchronized (this.f71640b) {
            bArr = (byte[]) this.f71642d.poll();
            while (bArr == null) {
                if (!this.f71643e) {
                    try {
                        this.f71640b.wait();
                        bArr = (byte[]) this.f71642d.poll();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new IOException("Interrupted while reading", e);
                    }
                } else {
                    throw new IOException("Connection closed. Quit reading.");
                }
            }
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akdd", "a", 113, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("Read NearbyConnection message %s from %s", Arrays.toString(bArr), this.f71641c);
            if (Arrays.equals(f71639a, bArr)) {
                throw new IOException("Connection closed. Quit reading.");
            }
        }
        return bArr;
    }
}
