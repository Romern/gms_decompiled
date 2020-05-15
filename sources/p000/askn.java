package p000;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: askn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class askn implements askr {
    /* renamed from: a */
    public final void mo49213a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS GlobalValues (key_id text not null, value text not null, environment text not null, PRIMARY KEY(key_id, environment))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS Wallets (account_id text not null, environment text not null, wallet_id text, is_active_wallet int default 0, gcm_id text, add_orchestration_token text, has_cloud_pin int default 0, receives_transaction_notifications int default 1, fails_attestation int default 0, receives_plastic_transaction_notifications int default 1, is_payments_enabled int default 1, additional_wallet_data text, user_signature blob, PRIMARY KEY(account_id, environment))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS PaymentBundles (account_id text not null, environment text not null, bundle_type text not null, new_bundle_type text, bundle_id text not null, bundle_state text not null, session_id text, encryption_parameters blob, bundle_handle blob, bundle_info blob, poll_timestamp int, unacknowledged_bundle blob, acknowledged_bundle blob, key_id text, last_modified int)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS PaymentCards (account_id text not null, environment text not null, billing_id text not null, card blob not null, is_selected int default 0, last_modified int, activation_method text, token_state int, override_realtime_min int, override_realtime_max int, UNIQUE (billing_id, environment))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS LogMessages (id integer primary key, environment text not null, account_name text not null, proto blob not null)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS TapInfos (id integer primary key, environment text not null, account_name text not null, proto blob not null)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS TapDoodleGroups (doodle_group_id string NOT NULL, environment text NOT NULL, account_id text NOT NULL, proto blob NOT NULL, priority integer, PRIMARY KEY (doodle_group_id, environment, account_id));");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS SelectAidCache (account_id text not null, environment text not null, aid blob not null, select_response blob, PRIMARY KEY(account_id, environment, aid));");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ActivationMethodLimits (environment text NOT NULL, account_id text NOT NULL, billing_id text NOT NULL, activation_method_handle text NOT NULL, proto blob NOT NULL, PRIMARY KEY (activation_method_handle, environment, account_id, billing_id));");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS DoodleRenderedInfos (id integer primary key, environment text not null, account_name text not null, proto blob not null)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS StorageKeys (environment text not null, account_id text not null, storage_key_id text not null, storage_key_encrypted_key blob not null, iv blob not null, PRIMARY KEY (environment, account_id))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS WhitelistVerdicts (package_name text not null primary key, environment text not null, request_proto blob, response_proto blob not null)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS SePaymentCards (client_token_id text unique not null, se_card_id text, account_id text not null, environment text not null, network_id int not null, is_default bool not null, activation_method text, pending_state int, last_modified_s int not null, card blob not null, bundle_id text, session_id text, bundle_handle blob)");
    }
}
