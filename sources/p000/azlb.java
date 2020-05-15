package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.libraries.matchstick.data.DatabaseProvider;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.android.libraries.matchstick.p091ui.CardChimeraActivity;
import java.util.List;

/* renamed from: azlb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azlb extends soa {

    /* renamed from: a */
    public final aznz f99575a;

    /* renamed from: b */
    public final boolean f99576b;

    /* renamed from: c */
    public Bitmap f99577c;

    /* renamed from: d */
    public List f99578d;

    /* renamed from: h */
    public String f99579h;

    /* renamed from: i */
    final /* synthetic */ CardChimeraActivity f99580i;

    /* renamed from: j */
    private final byte[] f99581j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public azlb(CardChimeraActivity cardChimeraActivity, byte[] bArr, aznz aznz, boolean z) {
        super(9);
        this.f99580i = cardChimeraActivity;
        this.f99581j = bArr;
        this.f99575a = aznz;
        this.f99576b = z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: azal.a(android.content.Context, java.util.List, boolean):android.graphics.Bitmap
     arg types: [android.content.Context, java.util.List, int]
     candidates:
      azal.a(android.content.Context, com.google.android.libraries.matchstick.data.LocalEntityId, boolean):android.graphics.Bitmap
      azal.a(android.content.Context, java.util.List, boolean):android.graphics.Bitmap */
    public final void run() {
        byte[] bArr;
        if (this.f99575a != null) {
            List a = DatabaseProvider.m94525a(this.f99580i.getApplicationContext().getContentResolver(), this.f99575a);
            this.f99578d = a;
            LocalEntityId localEntityId = (LocalEntityId) a.get(0);
            CardChimeraActivity cardChimeraActivity = this.f99580i;
            int i = CardChimeraActivity.f111167L;
            String c = azny.m85888c(cardChimeraActivity.f111239w, localEntityId);
            if (TextUtils.isEmpty(c)) {
                c = localEntityId.f111074a;
                if (localEntityId.f111075b == 1) {
                    c = azot.m85964a(c, (TelephonyManager) this.f99580i.f111239w.getSystemService("phone"));
                }
            }
            this.f99579h = c;
            if (this.f99575a.mo55105c()) {
                Bitmap a2 = azny.m85882a(this.f99580i.getApplicationContext(), (LocalEntityId) this.f99578d.get(0));
                this.f99577c = a2;
                if (a2 == null && (bArr = this.f99581j) != null) {
                    this.f99577c = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                }
                if (this.f99577c == null) {
                    this.f99577c = azny.m85881a(this.f99580i.getApplicationContext());
                }
                this.f99577c = azal.m85136a(this.f99580i.getApplicationContext(), this.f99577c);
            } else {
                byte[] bArr2 = this.f99581j;
                if (bArr2 != null) {
                    this.f99577c = BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length);
                    this.f99577c = azal.m85136a(this.f99580i.getApplicationContext(), this.f99577c);
                }
                if (this.f99577c == null) {
                    this.f99577c = azal.m85139a(this.f99580i.getApplicationContext(), this.f99578d, true);
                }
            }
            if (this.f99575a.mo55109g()) {
                this.f99580i.f111222f = false;
                for (LocalEntityId localEntityId2 : this.f99578d) {
                    int i2 = localEntityId2.f111075b;
                    if ((i2 == 1 || i2 == 7) && this.f99580i.mo60401A().equals(localEntityId2.f111074a)) {
                        this.f99580i.f111222f = true;
                    }
                }
            }
        }
        this.f99580i.runOnUiThread(new azla(this));
    }
}
