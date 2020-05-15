package p000;

import android.content.Context;
import android.util.Pair;
import com.google.android.gms.ocr.credit.base.DeviceAccountName;
import com.google.android.gms.ocr.credit.base.NameResult;
import com.google.android.gms.ocr.credit.processors.CreditCardRecognizer;

/* renamed from: akte */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akte extends akuu {

    /* renamed from: a */
    public DeviceAccountName f72719a;

    /* renamed from: b */
    private final Context f72720b;

    /* renamed from: c */
    private final CreditCardRecognizer f72721c;

    /* renamed from: d */
    private final boolean f72722d;

    /* renamed from: e */
    private final float f72723e;

    /* renamed from: f */
    private final aksc f72724f;

    /* renamed from: g */
    private byte[] f72725g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo39833a() {
        this.f72724f.mo39773f();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Pair mo39835b(Object obj) {
        String str;
        String str2;
        aksy aksy = (aksy) obj;
        byte[] data = aksy.mo39890e().f81337c.getData();
        boolean z = false;
        NameResult nameResult = null;
        if (data != null) {
            DeviceAccountName deviceAccountName = this.f72719a;
            if (deviceAccountName != null) {
                String upperCase = deviceAccountName.f81293a.toUpperCase();
                String upperCase2 = deviceAccountName.f81294b.toUpperCase();
                String upperCase3 = deviceAccountName.f81295c.toUpperCase();
                String upperCase4 = deviceAccountName.f81296d.toUpperCase();
                int length = String.valueOf(upperCase).length();
                StringBuilder sb = new StringBuilder(length + 3 + String.valueOf(upperCase2).length() + String.valueOf(upperCase3).length() + String.valueOf(upperCase4).length());
                sb.append(upperCase);
                sb.append(",");
                sb.append(upperCase2);
                sb.append(",");
                sb.append(upperCase3);
                sb.append(",");
                sb.append(upperCase4);
                str = sb.toString();
            } else {
                str = "";
            }
            CreditCardRecognizer creditCardRecognizer = this.f72721c;
            byte[] bArr = this.f72725g;
            creditCardRecognizer.f81311a.mo39895a();
            NameResult nativeGetCardHolderName = creditCardRecognizer.nativeGetCardHolderName(data, str, bArr, 0);
            if (nativeGetCardHolderName == null || !this.f72722d || (nativeGetCardHolderName.f81306f != 0 && nativeGetCardHolderName.mo44733d() >= ((double) this.f72723e) && (str2 = nativeGetCardHolderName.f81304a) != null && str2.length() > 3)) {
                nameResult = nativeGetCardHolderName;
            }
            if (nameResult != null) {
                nameResult.f81307g = this.f72719a;
            }
        }
        aksy.mo39826a(nameResult);
        if (nameResult != null) {
            z = true;
        }
        return new Pair(Boolean.valueOf(z), aksy);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo39836c(Object obj) {
        ((aksy) obj).mo39826a((NameResult) null);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ boolean mo39837d(Object obj) {
        aksy aksy = (aksy) obj;
        if (this.f72725g == null) {
            byte[] a = aktx.m60454a(this.f72720b, 1);
            this.f72725g = a;
            if (a.length > 0) {
                this.f72724f.mo39793v();
            }
        }
        if (this.f72725g.length <= 0 || aksy.mo39890e().f81335a == null || aksy.mo39890e().f81337c == null) {
            return false;
        }
        return true;
    }

    public akte(Context context, CreditCardRecognizer creditCardRecognizer, boolean z, float f, aksc aksc) {
        this.f72720b = context;
        this.f72721c = creditCardRecognizer;
        this.f72722d = z;
        this.f72723e = f;
        this.f72724f = aksc;
        aksc.mo39752B();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo39834a(long j) {
        this.f72724f.mo39772e(j);
    }
}
