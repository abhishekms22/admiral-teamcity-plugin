package io.shipright.teamcity;

import java.util.LinkedHashMap;
import java.util.Map;

public class SSHRunnerConstants {

    public static final String SSH_EXEC_RUN_TYPE = "ssh-exec-runner";

    public static final String PARAM_HOST = "jetbrains.buildServer.sshexec.host";
    public static final String PARAM_PORT = "jetbrains.buildServer.sshexec.port";
    public static final String PARAM_USERNAME = "jetbrains.buildServer.sshexec.username";
    public static final String PARAM_PASSWORD = "jetbrains.buildServer.sshexec.password";
    public static final String PARAM_KEYFILE = "jetbrains.buildServer.sshexec.keyFile";
    public static final String PARAM_AUTH_METHOD = "jetbrains.buildServer.sshexec.authMethod";
    public static final String PARAM_COMMAND = "jetbrains.buildServer.sshexec.command";
    public static final String PARAM_PTY = "jetbrains.buildServer.sshexec.pty";

    public static final String PARAM_TRANSPORT = "jetbrains.buildServer.deployer.ssh.transport";

    public static final String TRANSPORT_SCP = "jetbrains.buildServer.deployer.ssh.transport.scp";
    public static final String TRANSPORT_SFTP = "jetbrains.buildServer.deployer.ssh.transport.sftp";
    public static final String AUTH_METHOD_DEFAULT_KEY = "DEFAULT_KEY";
    public static final String AUTH_METHOD_CUSTOM_KEY = "CUSTOM_KEY";
    public static final String AUTH_METHOD_USERNAME_PWD = "PWD";
    public static final String AUTH_METHOD_SSH_AGENT = "SSH_AGENT";

    public String getTransportType() {
        return PARAM_TRANSPORT;
    }

    public Map<String, String> getTransportTypeValues() {
        final Map<String, String> result = new LinkedHashMap<String, String>();
        result.put(TRANSPORT_SCP, "SCP");
        result.put(TRANSPORT_SFTP, "SFTP");
        return result;
    }


}
