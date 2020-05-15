package p000;

import com.google.android.gms.ocr.GiftCardOcrResult;
import java.util.List;

/* renamed from: aktn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aktn extends akvf {

    /* renamed from: a */
    public List f72771a;

    /* renamed from: b */
    public String f72772b;

    public aktn(akus akus, akve akve) {
        super(akus, akve);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo39745a() {
        return this.f72954d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo39746b() {
        if (this.f72771a == null) {
            return null;
        }
        akpd a = GiftCardOcrResult.m67678a();
        a.f72381a = this.f72771a;
        a.f72382b = this.f72772b;
        return a.mo39640a();
    }
}
