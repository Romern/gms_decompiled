package p000;

import android.util.Log;
import com.google.android.libraries.bluetooth.BluetoothException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.UUID;

/* renamed from: bedy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bedy {

    /* renamed from: g */
    private static final String f106994g = bedy.class.getSimpleName();

    /* renamed from: a */
    public final Object f106995a = new Object();

    /* renamed from: b */
    public final bedj f106996b;

    /* renamed from: c */
    public final bedo f106997c;

    /* renamed from: d */
    public bedt f106998d = null;

    /* renamed from: e */
    public bede f106999e = null;

    /* renamed from: f */
    public ausd f107000f = null;

    public bedy(bedj bedj, aysi aysi) {
        bedo bedo = new bedo();
        bmxy.m108581a(bedj);
        this.f106996b = bedj;
        bmxy.m108581a(aysi);
        this.f106997c = bedo;
    }

    /* renamed from: a */
    public static UUID m91843a(bede bede) {
        try {
            bede.mo58564a(bedz.f107001a);
            return bedz.f107001a;
        } catch (BluetoothException e) {
            String str = f106994g;
            String valueOf = String.valueOf(bedz.f107001a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54);
            sb.append("Service ");
            sb.append(valueOf);
            sb.append(" not found; Reverse the uuid order and re-try.");
            Log.w(str, sb.toString());
            UUID uuid = bedz.f107001a;
            ByteBuffer allocate = ByteBuffer.allocate(16);
            allocate.putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits());
            allocate.rewind();
            Collections.reverse(bqce.m112560a(allocate.array()));
            UUID uuid2 = new UUID(allocate.getLong(), allocate.getLong());
            String valueOf2 = String.valueOf(uuid2.toString());
            if (valueOf2.length() == 0) {
                new String("reversed uuid:");
            } else {
                "reversed uuid:".concat(valueOf2);
            }
            if (bede.mo58563a(uuid2, bedz.f107003c) != null) {
                return uuid2;
            }
            String valueOf3 = String.valueOf(bedz.f107001a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 19);
            sb2.append("Service ");
            sb2.append(valueOf3);
            sb2.append(" not found.");
            throw new BluetoothException(sb2.toString());
        }
    }
}
