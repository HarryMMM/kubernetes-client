package cn.harryai.kubernetesclient;

import io.fabric8.kubernetes.api.model.*;
import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.ConfigBuilder;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.dsl.NonNamespaceOperation;
import io.fabric8.kubernetes.client.dsl.Resource;

public class Testt
{
    public static void main(String[] args) {
        Config config = new ConfigBuilder().withMasterUrl("https://mymaster.com").build();
        KubernetesClient client = new DefaultKubernetesClient(config);
        final NamespaceList list = client.namespaces().list();
        Service service = client.services().inNamespace("").withName("").get();
        Pod pod = client.pods().inNamespace("").withName("").get();
        Namespace namespace = client.namespaces().withName("").get();
        client.resourceQuotas().inNamespace("");


    }
}
