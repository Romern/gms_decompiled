package p000;

import android.util.Log;
import com.google.android.gms.wallet.service.p086ib.IbBuyFlowInput;
import com.google.android.gms.wallet.service.p086ib.RefreshUserSpecificDataResponse;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import java.util.Locale;

/* renamed from: awsv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awsv {

    /* renamed from: a */
    private final awwt f95064a;

    /* renamed from: b */
    private final awta f95065b;

    /* renamed from: c */
    private final BuyFlowConfig f95066c;

    /* renamed from: d */
    private final IbBuyFlowInput f95067d;

    public awsv(awwt awwt, awta awta, BuyFlowConfig buyFlowConfig, IbBuyFlowInput ibBuyFlowInput) {
        this.f95064a = awwt;
        this.f95065b = awta;
        this.f95066c = buyFlowConfig;
        this.f95067d = ibBuyFlowInput;
    }

    /* renamed from: a */
    public final RefreshUserSpecificDataResponse mo52543a() {
        IbBuyFlowInput b = this.f95067d.mo59984b();
        bxvd bxvd = b.f110341c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwgv bwgv = (bwgv) bxvd.f164949b;
        bwgv bwgv2 = bwgv.f159275p;
        bwgv.f159277a |= 128;
        bwgv.f159285i = false;
        bxvd bxvd2 = b.f110341c;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bwgv bwgv3 = (bwgv) bxvd2.f164949b;
        bwgv3.f159277a &= -513;
        bwgv3.f159287k = bwgv.f159275p.f159287k;
        bxvd bxvd3 = b.f110341c;
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        bwgv bwgv4 = (bwgv) bxvd3.f164949b;
        bwgv4.f159277a &= -257;
        bwgv4.f159286j = bwgv.f159275p.f159286j;
        bxvd bxvd4 = b.f110341c;
        bmks bmks = ((bwgv) bxvd4.f164949b).f159288l;
        if (bmks == null) {
            bmks = bmks.f129878d;
        }
        bxvd bxvd5 = (bxvd) bmks.mo74142c(5);
        bxvd5.mo73625a((GeneratedMessageLite) bmks);
        bmkn bmkn = (bmkn) bxvd5;
        if (bmkn.f164950c) {
            bmkn.mo74035c();
            bmkn.f164950c = false;
        }
        ((bmks) bmkn.f164949b).f129882c = GeneratedMessageLite.m124030de();
        if (bxvd4.f164950c) {
            bxvd4.mo74035c();
            bxvd4.f164950c = false;
        }
        bwgv bwgv5 = (bwgv) bxvd4.f164949b;
        bmks bmks2 = (bmks) bmkn.mo74062i();
        bmks2.getClass();
        bwgv5.f159288l = bmks2;
        bwgv5.f159277a |= 1024;
        awta awta = this.f95065b;
        BuyFlowConfig buyFlowConfig = this.f95066c;
        ApplicationParameters applicationParameters = buyFlowConfig.f110418b;
        byal a = awta.mo52547a(applicationParameters.f110406a, applicationParameters.f110407b, buyFlowConfig.f110419c);
        if (a != null) {
            b.mo59980a(a);
        }
        if (b.mo59997f()) {
            awwt awwt = this.f95064a;
            BuyFlowConfig buyFlowConfig2 = this.f95066c;
            asmi c = awwt.mo65549c(buyFlowConfig2, buyFlowConfig2.f110418b.f110407b, b.mo59994e());
            if (c.mo7183bo().mo17710c()) {
                b.mo59981a(c.mo49240b());
            } else {
                Log.w("RefreshUserSpecificData", String.format(Locale.US, "Failed to fetch cards for Android Pay! status = %s message = %s", Integer.valueOf(c.mo7183bo().f30115i), c.mo7183bo().f30116j));
                return new RefreshUserSpecificDataResponse(null, 8, 1018);
            }
        }
        return new RefreshUserSpecificDataResponse(b, 0, 1);
    }
}
