package p000;

import android.os.Parcel;
import android.util.MutableBoolean;
import com.google.android.gms.common.api.Status;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: jsc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jsc extends dck implements jsd {

    /* renamed from: a */
    final /* synthetic */ ByteArrayOutputStream f23148a;

    /* renamed from: b */
    final /* synthetic */ MutableBoolean f23149b;

    public jsc() {
        super("com.google.android.gms.auth.proximity.internal.IGetMyPublicKeyCallback");
    }

    /* renamed from: a */
    public final void mo14031a(Status status, byte[] bArr) {
        if (status.equals(Status.f30107a) && bArr != null) {
            try {
                this.f23148a.write(bArr);
                this.f23149b.value = true;
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jsc(ByteArrayOutputStream byteArrayOutputStream, MutableBoolean mutableBoolean) {
        super("com.google.android.gms.auth.proximity.internal.IGetMyPublicKeyCallback");
        this.f23148a = byteArrayOutputStream;
        this.f23149b = mutableBoolean;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo14031a((Status) dcl.m8163a(parcel, Status.CREATOR), parcel.createByteArray());
        return true;
    }
}
