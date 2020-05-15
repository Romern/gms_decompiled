package p000;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.internal.PutDataResponse;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.FutureTask;

/* renamed from: axqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axqn extends axpu {

    /* renamed from: a */
    final /* synthetic */ PutDataRequest f96271a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public axqn(rkb rkb, PutDataRequest putDataRequest) {
        super(rkb);
        this.f96271a = putDataRequest;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        axtl axtl = (axtl) rjd;
        PutDataRequest putDataRequest = this.f96271a;
        for (Map.Entry entry : putDataRequest.mo60251a().entrySet()) {
            Asset asset = (Asset) entry.getValue();
            if (asset.f110860a == null && asset.f110861b == null && asset.f110862c == null && asset.f110863d == null) {
                String valueOf = String.valueOf(putDataRequest.f110874a);
                String valueOf2 = String.valueOf(asset);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33 + String.valueOf(valueOf2).length());
                sb.append("Put for ");
                sb.append(valueOf);
                sb.append(" contains invalid asset: ");
                sb.append(valueOf2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        PutDataRequest a = PutDataRequest.m94391a(putDataRequest.f110874a);
        a.f110876c = putDataRequest.f110876c;
        if (putDataRequest.f110877d == 0) {
            a.f110877d = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry2 : putDataRequest.mo60251a().entrySet()) {
            Asset asset2 = (Asset) entry2.getValue();
            if (asset2.f110860a != null) {
                try {
                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                    if (Log.isLoggable("WearableClient", 3)) {
                        String valueOf3 = String.valueOf(asset2);
                        String valueOf4 = String.valueOf(createPipe[0]);
                        String valueOf5 = String.valueOf(createPipe[1]);
                        int length = String.valueOf(valueOf3).length();
                        StringBuilder sb2 = new StringBuilder(length + 61 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
                        sb2.append("processAssets: replacing data with FD in asset: ");
                        sb2.append(valueOf3);
                        sb2.append(" read:");
                        sb2.append(valueOf4);
                        sb2.append(" write:");
                        sb2.append(valueOf5);
                        Log.d("WearableClient", sb2.toString());
                    }
                    a.mo60252a((String) entry2.getKey(), Asset.m94387a(createPipe[0]));
                    FutureTask futureTask = new FutureTask(new axtk(createPipe[1], asset2.f110860a));
                    arrayList.add(futureTask);
                    axtl.f96315a.submit(futureTask);
                } catch (IOException e) {
                    String valueOf6 = String.valueOf(putDataRequest);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf6).length() + 60);
                    sb3.append("Unable to create ParcelFileDescriptor for asset in request: ");
                    sb3.append(valueOf6);
                    throw new IllegalStateException(sb3.toString(), e);
                }
            } else if (asset2.f110863d == null) {
                a.mo60252a((String) entry2.getKey(), asset2);
            } else {
                try {
                    a.mo60252a((String) entry2.getKey(), Asset.m94387a(axtl.f43948r.getContentResolver().openFileDescriptor(asset2.f110863d, "r")));
                } catch (FileNotFoundException e2) {
                    new axtg(this, arrayList).mo53458a(new PutDataResponse(4005, null));
                    String valueOf7 = String.valueOf(asset2.f110863d);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf7).length() + 28);
                    sb4.append("Couldn't resolve asset URI: ");
                    sb4.append(valueOf7);
                    Log.w("WearableClient", sb4.toString());
                    return;
                }
            }
        }
        ((axry) axtl.mo25289B()).mo53470a(new axtg(this, arrayList), a);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return new axqo(status, null);
    }
}
