package p000;

import java.io.DataInputStream;
import java.io.File;

/* renamed from: bfom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfom implements Comparable {

    /* renamed from: a */
    public final File f114555a;

    /* renamed from: b */
    public final DataInputStream f114556b;

    /* renamed from: c */
    public final long f114557c;

    /* renamed from: d */
    public final short[] f114558d;

    /* renamed from: e */
    public final long f114559e;

    public bfom(File file, DataInputStream dataInputStream, long j, short[] sArr, long j2) {
        this.f114555a = file;
        this.f114556b = dataInputStream;
        this.f114557c = j;
        this.f114558d = sArr;
        this.f114559e = j2;
    }

    /* renamed from: a */
    public final long mo62042a() {
        return this.f114557c + this.f114559e;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return (mo62042a() > ((bfom) obj).mo62042a() ? 1 : (mo62042a() == ((bfom) obj).mo62042a() ? 0 : -1));
    }
}
