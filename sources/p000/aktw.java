package p000;

import com.google.android.gms.common.download.DownloadDetails;

/* renamed from: aktw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aktw {

    /* renamed from: a */
    public static final DownloadDetails f72789a;

    /* renamed from: b */
    public static final DownloadDetails f72790b;

    /* renamed from: c */
    public static final DownloadDetails f72791c;

    static {
        rxw rxw = new rxw("params_expdate_c45e5b7.dat", "https://dl.google.com/vision/1/creditcard/params_expdate_c45e5b7.dat", 133157, "c45e5b78490cf2cdf106ae1412f2919541964402");
        rxw.f43837e = "commerce_ocr";
        f72789a = rxw.mo25246a();
        rxw rxw2 = new rxw("params_chname_convnet.dat.gz", "https://dl.google.com/vision/1000/creditcard/params_chname_convnet.dat.gz", 147746, "493ffeebdb8117d3dcc090d32b72c467d0b5a4ab");
        rxw2.f43837e = "commerce_ocr";
        f72790b = rxw2.mo25246a();
        rxw rxw3 = new rxw("params_chname_convnet_optimized.dat.gz", "https://dl.google.com/vision/1000/creditcard/params_chname_convnet_optimized.dat.gz", 173962, "9b73d81706a6f75d41db5ee0d7af2f527b791819");
        rxw3.f43837e = "commerce_ocr";
        f72791c = rxw3.mo25246a();
    }
}
