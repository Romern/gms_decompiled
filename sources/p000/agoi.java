package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdRequest;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusRequest;
import com.google.android.gms.mobiledataplan.MdpPurchaseOfferRequest;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferRequest;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationRequest;
import com.google.android.gms.mobiledataplan.consent.SetConsentStatusRequest;

/* renamed from: agoi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agoi extends rjx implements agph {

    /* renamed from: a */
    private static final rjo f66169a = new rjo("MobileDataPlan.API", f66171f, f66170e);

    /* renamed from: e */
    private static final rje f66170e = new rje();

    /* renamed from: f */
    private static final rjl f66171f = new agnx();

    /* renamed from: b */
    private String f66172b;

    /* renamed from: c */
    private String f66173c;

    /* renamed from: d */
    private int f66174d;

    public agoi(Context context, agpf agpf) {
        super(context, f66169a, agpf, rjw.f43159a);
        String packageName = context.getApplicationContext().getPackageName();
        this.f66172b = packageName;
        if (packageName != null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(this.f66172b, 0);
                this.f66173c = packageInfo.versionName;
                this.f66174d = packageInfo.versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                this.f66172b = "PACKAGE_NAME_NOT_FOUND";
                this.f66173c = "PACKAGE_VERSION_NOT_FOUND";
                this.f66174d = -1;
            }
        } else {
            throw new PackageManager.NameNotFoundException();
        }
    }

    /* renamed from: a */
    private final Bundle m54688a(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("client_package_name", this.f66172b);
        bundle.putString("client_version_name", this.f66173c);
        bundle.putLong("client_version_code", (long) this.f66174d);
        return bundle;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public final aucb mo35768a(MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest) {
        sdo.m34975b(true, "getCarrierPlanId needs a non-null valid API key provided by GTAF team.");
        sdo.m34969a(mdpCarrierPlanIdRequest.f80147a, (Object) "getCarrierPlanId needs a valid API key provided by GTAF team.");
        agoj agoj = new agoj(mdpCarrierPlanIdRequest);
        agoj.f66175a.f80148b = m54688a(mdpCarrierPlanIdRequest.f80148b);
        return mo24732b(new agnz(agoj));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public final aucb mo35769a(MdpDataPlanStatusRequest mdpDataPlanStatusRequest) {
        sdo.m34975b(true, "getDataPlanStatus needs a non-null request object.");
        sdo.m34969a(mdpDataPlanStatusRequest.f80182a, (Object) "getDataPlanStatus needs a non-empty Carrier Plan Id.");
        agop agop = new agop(mdpDataPlanStatusRequest);
        agop.f66187a.f80183b = m54688a(mdpDataPlanStatusRequest.f80183b);
        return mo24732b(new agob(agop));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public final aucb mo35770a(MdpPurchaseOfferRequest mdpPurchaseOfferRequest) {
        sdo.m34975b(true, "purchaseOffer needs a non-null request object.");
        sdo.m34969a(mdpPurchaseOfferRequest.f80198a, (Object) "purchaseOffer needs a non-empty Carrier Plan Id.");
        sdo.m34969a(mdpPurchaseOfferRequest.f80199b, (Object) "purchaseOffer needs a non-empty Plan ID (from the upsell offers) for purchase.");
        sdo.m34969a(mdpPurchaseOfferRequest.f80201d, (Object) "purchaseOffer needs a non-empty (self-generated) Transaction ID for purchase.");
        agou agou = new agou(mdpPurchaseOfferRequest);
        agou.f66200e = m54688a(mdpPurchaseOfferRequest.f80202e);
        return mo24732b(new agof(agou));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public final aucb mo35771a(MdpUpsellOfferRequest mdpUpsellOfferRequest) {
        sdo.m34975b(true, "getUpsellOffer needs a non-null request object.");
        sdo.m34969a(mdpUpsellOfferRequest.f80218a, (Object) "getUpsellOffer needs a non-empty Carrier Plan Id.");
        agoy agoy = new agoy(mdpUpsellOfferRequest);
        agoy.f66217b = m54688a(mdpUpsellOfferRequest.f80219b);
        return mo24732b(new agod(agoy));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public final aucb mo35772a(GetConsentInformationRequest getConsentInformationRequest) {
        boolean z;
        if (getConsentInformationRequest != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "getConsentInformation needs a non-null Module request");
        sdo.m34969a(getConsentInformationRequest.f80271a, (Object) "getConsentInformation needs a non-empty Client CPID");
        agql agql = new agql(getConsentInformationRequest);
        agql.f66281a.f80275e = m54688a(getConsentInformationRequest.f80275e);
        roz b = rpa.m34196b();
        b.f43472a = new agnv(agql);
        b.f43473b = new Feature[]{agnu.f66153a};
        return mo24732b(b.mo24977a());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public final aucb mo35773a(SetConsentStatusRequest setConsentStatusRequest) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (setConsentStatusRequest != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "setConsentStatus needs a non-null Module request");
        sdo.m34969a(setConsentStatusRequest.f80283a, (Object) "setConsentStatus needs a non-empty Client CPID");
        if (setConsentStatusRequest.f80284b != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34975b(z2, "setConsentStatus needs a non-null Session ID");
        if (setConsentStatusRequest.f80285c != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        sdo.m34975b(z3, "setConsentStatus needs a non-null ConsentStatus");
        if (setConsentStatusRequest.f80286d != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        sdo.m34975b(z4, "setConsentStatus needs a non-null Consent Time");
        agqr agqr = new agqr(setConsentStatusRequest);
        agqr.f66284a.f80290h = m54688a(setConsentStatusRequest.f80290h);
        roz b = rpa.m34196b();
        b.f43472a = new agnw(agqr);
        b.f43473b = new Feature[]{agnu.f66153a};
        return mo24732b(b.mo24977a());
    }
}
