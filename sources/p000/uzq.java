package p000;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import java.util.Arrays;

/* renamed from: uzq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uzq extends uza {

    /* renamed from: c */
    public static final uzq f48775c = new uzq();

    private uzq() {
        super("driveId", Arrays.asList("sqlId", "resourceId", "mimeType"), Arrays.asList("dbInstanceId"), 4100000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo28091b(DataHolder dataHolder, int i, int i2) {
        for (String str : this.f48654b) {
            if (!dataHolder.mo17766a(str)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo28092c(DataHolder dataHolder, int i, int i2) {
        long j = dataHolder.f30166f.getLong("dbInstanceId");
        boolean equals = "application/vnd.google-apps.folder".equals(dataHolder.mo17769c(uzm.f48738N.f48653a, i, i2));
        String c = dataHolder.mo17769c("resourceId", i, i2);
        return new DriveId("generated-android-null".equals(c) ? null : c, Long.valueOf(dataHolder.mo17763a("sqlId", i, i2)).longValue(), j, equals ? 1 : 0);
    }
}
