package p000;

import com.google.android.gms.wallet.analytics.events.CreateWalletObjectsEvent;
import com.google.android.gms.wallet.analytics.events.CreditCardEntryActionUpdatedEvent;
import com.google.android.gms.wallet.analytics.events.CreditCardEntryActivityClosedEvent;
import com.google.android.gms.wallet.analytics.events.CreditCardEntryLaunchedEvent;
import com.google.android.gms.wallet.analytics.events.CreditCardEntrySubmittedEvent;
import com.google.android.gms.wallet.analytics.events.CreditCardEntryValidationEvent;
import com.google.android.gms.wallet.analytics.events.GetClientTokenEvent;
import com.google.android.gms.wallet.analytics.events.IsReadyToPayCallEvent;
import com.google.android.gms.wallet.analytics.events.LoadPaymentDataCallEvent;
import com.google.android.gms.wallet.analytics.events.LoadWebPaymentDataCallEvent;
import com.google.android.gms.wallet.analytics.events.OcrActivityLaunchedEvent;
import com.google.android.gms.wallet.analytics.events.OcrEnabledStateEvent;
import com.google.android.gms.wallet.analytics.events.OcrResultReceivedEvent;
import com.google.android.gms.wallet.analytics.events.OwFullWalletRequestedEvent;
import com.google.android.gms.wallet.analytics.events.OwInitializedEvent;
import com.google.android.gms.wallet.analytics.events.OwMaskedWalletReceivedEvent;
import com.google.android.gms.wallet.analytics.events.OwMaskedWalletRequestedEvent;
import com.google.android.gms.wallet.analytics.events.OwMwAccountChangedEvent;
import com.google.android.gms.wallet.analytics.events.OwMwChooserShownEvent;
import com.google.android.gms.wallet.analytics.events.OwMwUnsuccessfulEvent;
import com.google.android.gms.wallet.analytics.events.OwUserFoundToHavePreAuthEvent;
import com.google.android.gms.wallet.analytics.events.OwWalletFragmentButtonClickedEvent;
import com.google.android.gms.wallet.analytics.events.PaySeCallEvent;
import com.google.android.gms.wallet.analytics.events.SimpleAnalyticsEvent;
import com.google.android.gms.wallet.analytics.events.TapAndPayCallEvent;
import com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent;

/* renamed from: awqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awqv {
    /* renamed from: a */
    public static Class m80733a(WalletAnalyticsEvent walletAnalyticsEvent) {
        if ((walletAnalyticsEvent instanceof CreditCardEntryActivityClosedEvent) || (walletAnalyticsEvent instanceof CreditCardEntryLaunchedEvent) || (walletAnalyticsEvent instanceof CreditCardEntrySubmittedEvent) || (walletAnalyticsEvent instanceof CreditCardEntryValidationEvent) || (walletAnalyticsEvent instanceof OcrActivityLaunchedEvent) || (walletAnalyticsEvent instanceof OcrEnabledStateEvent) || (walletAnalyticsEvent instanceof OcrResultReceivedEvent) || (walletAnalyticsEvent instanceof CreditCardEntryActionUpdatedEvent)) {
            return awqg.class;
        }
        if (walletAnalyticsEvent instanceof awqh) {
            return awqi.class;
        }
        if ((walletAnalyticsEvent instanceof OwMaskedWalletRequestedEvent) || (walletAnalyticsEvent instanceof OwUserFoundToHavePreAuthEvent) || (walletAnalyticsEvent instanceof OwMwAccountChangedEvent) || (walletAnalyticsEvent instanceof OwMwUnsuccessfulEvent) || (walletAnalyticsEvent instanceof OwMwChooserShownEvent) || (walletAnalyticsEvent instanceof OwMaskedWalletReceivedEvent)) {
            return awqs.class;
        }
        if (walletAnalyticsEvent instanceof OwInitializedEvent) {
            return awqr.class;
        }
        if (walletAnalyticsEvent instanceof OwFullWalletRequestedEvent) {
            return awqq.class;
        }
        if (walletAnalyticsEvent instanceof OwWalletFragmentButtonClickedEvent) {
            return awqp.class;
        }
        if (walletAnalyticsEvent instanceof awqn) {
            return awqo.class;
        }
        if (walletAnalyticsEvent instanceof TapAndPayCallEvent) {
            return awqx.class;
        }
        if (walletAnalyticsEvent instanceof IsReadyToPayCallEvent) {
            return awqk.class;
        }
        if (walletAnalyticsEvent instanceof GetClientTokenEvent) {
            return awqj.class;
        }
        if (walletAnalyticsEvent instanceof LoadWebPaymentDataCallEvent) {
            return awqm.class;
        }
        if (walletAnalyticsEvent instanceof LoadPaymentDataCallEvent) {
            return awql.class;
        }
        if (walletAnalyticsEvent instanceof CreateWalletObjectsEvent) {
            return awqf.class;
        }
        if (walletAnalyticsEvent instanceof SimpleAnalyticsEvent) {
            return awqw.class;
        }
        if (walletAnalyticsEvent instanceof PaySeCallEvent) {
            return awqt.class;
        }
        return null;
    }
}
