package p000;

import android.os.Looper;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;

/* renamed from: arkf */
public final /* synthetic */ class arkf implements roo {

    /* renamed from: a */
    private final BootstrapConfigurations f87805a;

    /* renamed from: b */
    private final ParcelFileDescriptor[] f87806b;

    /* renamed from: c */
    private final aqzp f87807c;

    /* renamed from: d */
    private final arba f87808d;

    public arkf(arba arba, BootstrapConfigurations bootstrapConfigurations, ParcelFileDescriptor[] parcelFileDescriptorArr, aqzp aqzp) {
        this.f87808d = arba;
        this.f87805a = bootstrapConfigurations;
        this.f87806b = parcelFileDescriptorArr;
        this.f87807c = aqzp;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        arba arba = this.f87808d;
        BootstrapConfigurations bootstrapConfigurations = this.f87805a;
        ParcelFileDescriptor[] parcelFileDescriptorArr = this.f87806b;
        aqzp aqzp = this.f87807c;
        arlb arlb = new arlb((aucf) obj2);
        ((ariw) ((arkb) obj).mo25289B()).mo48408a(new arjx(arlb), bootstrapConfigurations, parcelFileDescriptorArr, new arig(Looper.getMainLooper(), new arie(aqzp, arba, arba.f87260a, "source-direct-transfer")));
    }
}
