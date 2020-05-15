package p000;

import android.content.res.Configuration;
import com.google.android.gms.car.diagnostics.CriticalError;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: noz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface noz {
    /* renamed from: a */
    void mo17315a(bipi bipi);

    /* renamed from: a */
    void mo17316a(CriticalError criticalError);

    /* renamed from: a */
    boolean mo17317a();

    /* renamed from: b */
    void mo17318b();

    /* renamed from: c */
    Configuration mo17319c();

    /* renamed from: d */
    void mo17320d();

    void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: e */
    void mo17321e();
}
