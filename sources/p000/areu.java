package p000;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;

/* renamed from: areu */
final /* synthetic */ class areu implements roo {

    /* renamed from: a */
    private final BootstrapOptions f87548a;

    /* renamed from: b */
    private final ParcelFileDescriptor[] f87549b;

    /* renamed from: c */
    private final arib f87550c;

    public areu(BootstrapOptions bootstrapOptions, ParcelFileDescriptor[] parcelFileDescriptorArr, arib arib) {
        this.f87548a = bootstrapOptions;
        this.f87549b = parcelFileDescriptorArr;
        this.f87550c = arib;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        BootstrapOptions bootstrapOptions = this.f87548a;
        ParcelFileDescriptor[] parcelFileDescriptorArr = this.f87549b;
        arib arib = this.f87550c;
        arln arln = new arln((aucf) obj2);
        ((arji) ((arll) obj).mo25289B()).mo48496a(new arlk(arln), bootstrapOptions, parcelFileDescriptorArr, new arii(arib));
    }
}
