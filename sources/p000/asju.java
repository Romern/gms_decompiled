package p000;

import android.content.Intent;
import android.net.Uri;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.tapandpay.firstparty.CardInfo;

/* renamed from: asju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asju {

    /* renamed from: a */
    public static asjt f89098a;

    /* renamed from: a */
    public static Intent m74251a(askf askf, String str) {
        return IntentOperation.getStartIntent(askf.f89126d, "com.google.android.gms.tapandpay.cardart.CardArtIntentOperation", "com.google.android.gms.tapandpay.cardart.SYNC_CARD_ART").putExtra("extra_account_info", askf.mo49209a()).putExtra("EXTRA_CARD_ART", str);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bepr.a(android.graphics.Bitmap, boolean):void
     arg types: [android.graphics.Bitmap, int]
     candidates:
      bepr.a(double, double):int
      bepr.a(android.graphics.Rect, android.graphics.Paint):void
      bepr.a(android.graphics.Bitmap, boolean):void */
    /* renamed from: a */
    public static bepr m74252a(asjs asjs, CardInfo cardInfo, ImageView imageView) {
        String str;
        String str2;
        bepr bepr = new bepr(imageView.getContext());
        bepr.f112006i = true;
        m74253a(cardInfo, bepr);
        imageView.setImageDrawable(bepr);
        switch (bepr.f112001d) {
            case 1:
                str = bepr.f112000c.getString(C0126R.string.tp_amex);
                break;
            case 2:
                str = bepr.f112000c.getString(C0126R.string.tp_discover);
                break;
            case 3:
                str = bepr.f112000c.getString(C0126R.string.tp_mastercard);
                break;
            case 4:
                str = bepr.f112000c.getString(C0126R.string.tp_visa);
                break;
            case 5:
                str = bepr.f112000c.getString(C0126R.string.tp_interac);
                break;
            case 6:
                str = bepr.f112000c.getString(C0126R.string.tp_eftpos);
                break;
            case 7:
                str = bepr.f112000c.getString(C0126R.string.tp_maestro);
                break;
            case 8:
                str = bepr.f112000c.getString(C0126R.string.tp_elo);
                break;
            default:
                str = null;
                break;
        }
        if (str != null) {
            str2 = bepr.f112000c.getString(C0126R.string.tp_card_content_description, str, bepr.mo60916c());
        } else {
            str2 = bepr.f112000c.getString(C0126R.string.tp_card_other_content_description, bepr.mo60916c());
        }
        imageView.setContentDescription(str2);
        Uri uri = cardInfo.f108347h;
        asjt asjt = f89098a;
        if (asjt != null) {
            f89098a = null;
            if (asjt.f89096a.equals(uri)) {
                bepr.mo60914a(asjt.f89097b, true);
                return bepr;
            }
        }
        if (uri != null) {
            new asjv(bepr).executeOnExecutor(snp.m35704b(9), asjs.mo49202a(uri.toString()));
        }
        return bepr;
    }

    /* renamed from: a */
    public static void m74253a(CardInfo cardInfo, bepr bepr) {
        int i;
        int i2 = cardInfo.f108344e;
        int i3 = 1000;
        if (cardInfo.f108357r != 9) {
            if (i2 == 12) {
                i3 = 8;
            } else if (i2 != 1000) {
                switch (i2) {
                    case 1:
                        i3 = 1;
                        break;
                    case 2:
                        i3 = 2;
                        break;
                    case 3:
                        i3 = 3;
                        break;
                    case 4:
                        i3 = 4;
                        break;
                    case 5:
                        i3 = 5;
                        break;
                    case 6:
                    case 9:
                    case 10:
                        break;
                    case 7:
                        i3 = 6;
                        break;
                    case 8:
                        i3 = 7;
                        break;
                    default:
                        StringBuilder sb = new StringBuilder(27);
                        sb.append("Unknown network ");
                        sb.append(i2);
                        throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        bepr.f112001d = i3;
        switch (i3) {
            case 1:
                i = C0126R.C0127drawable.tp_networklogo_amex_color_98dp;
                bepr.f112007j = i;
                break;
            case 2:
                i = C0126R.C0127drawable.tp_networklogo_discover_color_98dp;
                bepr.f112007j = i;
                break;
            case 3:
                i = C0126R.C0127drawable.tp_networklogo_mastercard_color_98dp;
                bepr.f112007j = i;
                break;
            case 4:
                i = C0126R.C0127drawable.tp_networklogo_visa_color_98dp;
                bepr.f112007j = i;
                break;
            case 5:
                i = C0126R.C0127drawable.tp_networklogo_interac_color_98x97dp;
                bepr.f112007j = i;
                break;
            case 6:
                i = C0126R.C0127drawable.tp_networklogo_eftpos_color_98dp;
                bepr.f112007j = i;
                break;
            case 7:
                i = C0126R.C0127drawable.tp_networklogo_maestro_color_98dp;
                bepr.f112007j = i;
                break;
            case 8:
                i = C0126R.C0127drawable.tp_networklogo_elo_color_98dp;
                bepr.f112007j = i;
                break;
            default:
                bepr.f112007j = 0;
                break;
        }
        bepr.invalidateSelf();
        bepr.mo60915a(cardInfo.f108346g);
        bepr.f112003f = C1165lm.m19355b(cardInfo.f108348i, 255);
        if (!bepr.f112005h) {
            bepr.f112004g = null;
        }
        bepr.invalidateSelf();
        bepr.f111999b.setColor(C1165lm.m19355b(cardInfo.f108349j, 255));
        bepr.invalidateSelf();
    }
}
