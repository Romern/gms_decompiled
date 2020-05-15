package com.google.android.gms.ads.internal.clearcut;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.clearcut.C0231a;
import com.google.android.gms.ads.internal.util.client.C0633h;

/* renamed from: com.google.android.gms.ads.internal.clearcut.e */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0330e {

    /* renamed from: a */
    public int f8096a;

    /* renamed from: b */
    public int f8097b;

    /* renamed from: c */
    final /* synthetic */ C0331f f8098c;

    /* renamed from: d */
    private final byte[] f8099d;

    public C0330e(C0331f fVar, byte[] bArr) {
        this.f8098c = fVar;
        this.f8099d = bArr;
    }

    /* renamed from: a */
    public final synchronized void mo6569a() {
        try {
            C0331f fVar = this.f8098c;
            if (fVar.f8100a) {
                C0231a aVar = fVar.f8101b;
                byte[] bArr = this.f8099d;
                Parcel bj = aVar.mo8529bj();
                bj.writeByteArray(bArr);
                aVar.mo8528b(5, bj);
                C0231a aVar2 = this.f8098c.f8101b;
                int i = this.f8096a;
                Parcel bj2 = aVar2.mo8529bj();
                bj2.writeInt(i);
                aVar2.mo8528b(6, bj2);
                C0231a aVar3 = this.f8098c.f8101b;
                int i2 = this.f8097b;
                Parcel bj3 = aVar3.mo8529bj();
                bj3.writeInt(i2);
                aVar3.mo8528b(7, bj3);
                C0231a aVar4 = this.f8098c.f8101b;
                Parcel bj4 = aVar4.mo8529bj();
                bj4.writeIntArray(null);
                aVar4.mo8528b(4, bj4);
                C0231a aVar5 = this.f8098c.f8101b;
                aVar5.mo8528b(3, aVar5.mo8529bj());
            }
        } catch (RemoteException e) {
            C0633h.m5665a("Clearcut log failed", e);
        }
    }
}
