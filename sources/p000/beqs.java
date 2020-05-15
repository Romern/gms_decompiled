package p000;

import com.google.android.gms.location.ActivityRecognitionResult;
import java.io.PrintWriter;

/* renamed from: beqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class beqs extends bfop {

    /* renamed from: a */
    final /* synthetic */ ActivityRecognitionResult f112070a;

    /* renamed from: b */
    final /* synthetic */ boolean f112071b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public beqs(bfos bfos, long j, int i, int i2, int i3, ActivityRecognitionResult activityRecognitionResult, boolean z) {
        super(bfos, j, null, null, i, i2, i3);
        this.f112070a = activityRecognitionResult;
        this.f112071b = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60941a(PrintWriter printWriter) {
        printWriter.print(this.f112070a);
        printWriter.print(" sentToClient=");
        printWriter.print(this.f112071b);
    }
}
