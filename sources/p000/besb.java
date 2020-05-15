package p000;

import com.google.android.gms.location.ActivityRecognitionResult;
import java.io.PrintWriter;
import java.util.Collection;

/* renamed from: besb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class besb extends bfop {

    /* renamed from: a */
    final /* synthetic */ ActivityRecognitionResult f112267a;

    /* renamed from: b */
    final /* synthetic */ Collection f112268b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public besb(bfos bfos, long j, int i, ActivityRecognitionResult activityRecognitionResult, Collection collection) {
        super(bfos, j, i);
        this.f112267a = activityRecognitionResult;
        this.f112268b = collection;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60941a(PrintWriter printWriter) {
        printWriter.print("originalNlpActivity=");
        printWriter.print(this.f112267a);
        printWriter.print("; BluetoothDeviceParams=[");
        boolean z = true;
        for (beuh beuh : this.f112268b) {
            if (!z) {
                printWriter.print(", ");
            }
            printWriter.print(beuh);
            z = false;
        }
        printWriter.print("]");
    }
}
