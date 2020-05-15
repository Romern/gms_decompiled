package p000;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import com.google.android.gms.nearby.internal.connection.OnPayloadReceivedParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadTransferUpdateParams;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;

/* renamed from: aied */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aied extends aign {

    /* renamed from: a */
    private final Context f68823a;

    /* renamed from: b */
    private final rod f68824b;

    /* renamed from: c */
    private final Map f68825c = new C1223np();

    public aied(Context context, rod rod) {
        sdo.m34959a(context);
        this.f68823a = context;
        sdo.m34959a(rod);
        this.f68824b = rod;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo37456a() {
        for (Map.Entry entry : this.f68825c.entrySet()) {
            this.f68824b.mo24968a(new aieb(((aiec) entry.getKey()).f68821a, (PayloadTransferUpdate) entry.getValue()));
        }
        this.f68825c.clear();
    }

    /* renamed from: a */
    public final synchronized void mo36566a(OnPayloadReceivedParams onPayloadReceivedParams) {
        Context context = this.f68823a;
        ParcelablePayload parcelablePayload = onPayloadReceivedParams.f80597b;
        long j = parcelablePayload.f80605a;
        int i = parcelablePayload.f80606b;
        ahiq ahiq = null;
        if (i == 1) {
            ahiq = ahiq.m55841a(parcelablePayload.f80607c, j);
        } else if (i == 2) {
            String str = parcelablePayload.f80609e;
            Uri uri = parcelablePayload.f80612h;
            if (str == null || uri == null) {
                ahiq = ahiq.m55837a(ahio.m55834a(parcelablePayload.f80608d), j);
            } else {
                try {
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
                    File file = new File(str);
                    long j2 = parcelablePayload.f80610f;
                    sdo.checkIfNull(file, "Cannot create Payload.File from null java.io.File.");
                    sdo.checkIfNull(openFileDescriptor, "Cannot create Payload.File from null ParcelFileDescriptor.");
                    sdo.checkIfNull(uri, "Cannot create Payload.File from null Uri");
                    ahiq = ahiq.m55837a(new ahio(file, openFileDescriptor, j2), j);
                } catch (FileNotFoundException e) {
                    Log.w("NearbyConnections", String.format("Failed to create Payload from ParcelablePayload: unable to open uri %s for file %s.", uri, str), e);
                }
            }
        } else if (i != 3) {
            Log.w("NearbyConnections", String.format("Incoming ParcelablePayload %d has unknown type %d", Long.valueOf(j), Integer.valueOf(parcelablePayload.f80606b)));
        } else {
            ParcelFileDescriptor parcelFileDescriptor = parcelablePayload.f80608d;
            sdo.checkIfNull(parcelFileDescriptor, "Cannot create Payload.Stream from null ParcelFileDescriptor.");
            ahiq = ahiq.m55838a(new ahip(parcelFileDescriptor, null), j);
        }
        if (ahiq != null) {
            Map map = this.f68825c;
            aiec aiec = new aiec(onPayloadReceivedParams.f80596a, onPayloadReceivedParams.f80597b.f80605a);
            ahis ahis = new ahis();
            ahis.mo36542b(onPayloadReceivedParams.f80597b.f80605a);
            map.put(aiec, ahis.f67256a);
            this.f68824b.mo24968a(new aidz(onPayloadReceivedParams, ahiq));
            return;
        }
        Log.w("NearbyConnectionsClient", String.format("Failed to convert incoming ParcelablePayload %d to Payload.", Long.valueOf(onPayloadReceivedParams.f80597b.f80605a)));
    }

    /* renamed from: a */
    public final synchronized void mo36567a(OnPayloadTransferUpdateParams onPayloadTransferUpdateParams) {
        PayloadTransferUpdate payloadTransferUpdate = onPayloadTransferUpdateParams.f80600b;
        if (payloadTransferUpdate.f80477b == 3) {
            this.f68825c.put(new aiec(onPayloadTransferUpdateParams.f80599a, payloadTransferUpdate.f80476a), onPayloadTransferUpdateParams.f80600b);
        } else {
            this.f68825c.remove(new aiec(onPayloadTransferUpdateParams.f80599a, payloadTransferUpdate.f80476a));
        }
        this.f68824b.mo24968a(new aiea(onPayloadTransferUpdateParams));
    }
}
