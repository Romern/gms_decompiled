package p000;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;

/* renamed from: arkh */
public final /* synthetic */ class arkh implements roo {

    /* renamed from: a */
    private final BootstrapConfigurations f87810a;

    /* renamed from: b */
    private final ParcelFileDescriptor[] f87811b;

    /* renamed from: c */
    private final arib f87812c;

    public arkh(BootstrapConfigurations bootstrapConfigurations, ParcelFileDescriptor[] parcelFileDescriptorArr, arib arib) {
        this.f87810a = bootstrapConfigurations;
        this.f87811b = parcelFileDescriptorArr;
        this.f87812c = arib;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        BootstrapConfigurations bootstrapConfigurations = this.f87810a;
        ParcelFileDescriptor[] parcelFileDescriptorArr = this.f87811b;
        arib arib = this.f87812c;
        arlb arlb = new arlb((aucf) obj2);
        ((ariw) ((arkb) obj).mo25289B()).mo48407a(new arjx(arlb), bootstrapConfigurations, parcelFileDescriptorArr, new arii(arib));
    }
}
