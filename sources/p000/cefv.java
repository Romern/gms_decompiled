package p000;

/* renamed from: cefv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cefv implements cefu {

    /* renamed from: a */
    public static final bdyx f182617a;

    /* renamed from: b */
    public static final bdyx f182618b;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, boolean):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx */
    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.googlehelp")).mo58443a();
        f182617a = bdyx.m91610a(a, "AndroidGoogleHelp__enable_need_more_help_in_search_results", false);
        bdyx.m91610a(a, "AndroidGoogleHelp__enable_smart_journey", true);
        f182618b = bdyx.m91609a(a, "AndroidGoogleHelp__smart_journey_injected_js", "<script>window.get_help = function(page) {    var getHelpFlow = page.getChild();    if (typeof getHelpFlow === 'undefined') {        return;    }    getHelpFlow.getFormFlowStep().getEmbeddedForm()        .setContactFormCallback(function(form) {            form.setProductSpecificData(activity.getPsd());            form.listen('beforesubmit', function() {                form.setGcmRegistrationId(                    activity.getGcmRegistrationId());            });            form.listen('submitend', function() {                activity.onSubmit(form.getContactType(),                  form.getChatPoolId(),                  form.getCaseId());            });            form.listen('error', function() {                activity.onSubmitError(                    form.getContactType());            });    });};</script>");
    }

    /* renamed from: a */
    public final boolean mo79088a() {
        return ((Boolean) f182617a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final String mo79089b() {
        return (String) f182618b.mo58455c();
    }
}
