package p000;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.internal.GetFdForAssetResponse;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: ayhp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayhp extends ayfu {

    /* renamed from: c */
    final /* synthetic */ Asset f97613c;

    /* renamed from: d */
    final /* synthetic */ axrs f97614d;

    /* renamed from: e */
    final /* synthetic */ ayja f97615e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayhp(ayja ayja, String str, Asset asset, axrs axrs) {
        super(str);
        this.f97615e = ayja;
        this.f97613c = asset;
        this.f97614d = axrs;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    public final void mo53991a() {
        File file;
        ParcelFileDescriptor parcelFileDescriptor;
        try {
            ayja ayja = this.f97615e;
            axxv axxv = ayja.f97727f;
            axue axue = ayja.f97726e;
            String str = this.f97613c.f110861b;
            if (axxv.m83501a(axxv.f96695c.getReadableDatabase(), axue, str)) {
                file = axxv.f96696d.mo53578a(str);
            } else {
                file = null;
            }
            if (file != null) {
                try {
                    parcelFileDescriptor = ParcelFileDescriptor.open(file, 268435456);
                } catch (FileNotFoundException e) {
                    String valueOf = String.valueOf(file);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                    sb.append("Fail to open asset file ");
                    sb.append(valueOf);
                    Log.w("WearableService", sb.toString());
                    parcelFileDescriptor = null;
                }
            } else {
                parcelFileDescriptor = null;
            }
            if (parcelFileDescriptor == null) {
                String valueOf2 = String.valueOf(this.f97613c);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 40);
                sb2.append("getFdForAsset: unable to provide asset: ");
                sb2.append(valueOf2);
                Log.w("WearableService", sb2.toString());
                this.f97614d.mo53455a(new GetFdForAssetResponse(4005, null));
                return;
            }
            this.f97614d.mo53455a(new GetFdForAssetResponse(0, parcelFileDescriptor));
            if (ayji.m84107a(this.f97614d)) {
                parcelFileDescriptor.close();
            }
        } catch (Exception e2) {
            String valueOf3 = String.valueOf(this.f97613c);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 44);
            sb3.append("getFdForAsset: exception during processing: ");
            sb3.append(valueOf3);
            Log.e("WearableService", sb3.toString(), e2);
            this.f97614d.mo53455a(new GetFdForAssetResponse(8, null));
        } catch (Throwable th) {
            parcelFileDescriptor.close();
            throw th;
        }
    }
}
