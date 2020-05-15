package p000;

/* renamed from: pob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
interface pob {

    /* renamed from: a */
    public static final String f39900a = String.format("CREATE TABLE IF NOT EXISTS %s (%s, %s, %s, %s, %s, %s, %s, PRIMARY KEY (%s, %s, %s));", "ProbedSocketAddress", pod.m30950c("host_name", "NOT NULL"), pod.m30948b("port", "NOT NULL"), pod.m30950c("network_id", "NOT NULL"), pod.m30948b("is_responding_to_probe", "NOT NULL"), pod.m30948b("last_probed_timestamp_millis", "NOT NULL"), pod.m30948b("probing_error_code", "NOT NULL"), pod.m30948b("number_of_probed_times", "NOT NULL"), "host_name", "port", "network_id");
}
